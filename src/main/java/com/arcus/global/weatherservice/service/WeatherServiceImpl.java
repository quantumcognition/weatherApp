package com.arcus.global.weatherservice.service;

import com.arcus.global.weatherservice.domain.WeatherInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.quickgeo.Place;
import org.quickgeo.PostalDb;
import org.quickgeo.PostalDbFactory;

import java.util.List;
import java.util.Map;

public class WeatherServiceImpl implements WeatherService{

    private PostalDb postalDB;

    @Override
    public Place getPlaceByZipcode(String zipcode) {
        setPostalDB();
        return postalDB.byPostalCode(zipcode).get(0);
    }

    @Override
    public WeatherInfo getWeatherSummaryForCityByTime(String zipcode, String time) {
        setPostalDB();
        WeatherInfo weatherInfo = new WeatherInfo();
        try {

            Place place = getPlaceByZipcode(zipcode);
            String placeLatitude = String.valueOf(place.getLatitude());
            String placeLongitude = String.valueOf(place.getLongitude());
            String currentEpochTime = String.valueOf(System.currentTimeMillis()/1000);
            Client client = Client.create();

            WebResource webResource = client
                    .resource("https://api.darksky.net/forecast/904377b475672aee66197a44376f776c/" + placeLatitude+ "," + placeLongitude+ "," + currentEpochTime + "?exclude=currently,flags,hourly,hourly,minutely");

            ClientResponse response = webResource
                    .get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);
            System.out.println(output);
            ObjectMapper mapper = new ObjectMapper();
            Map responseJsonMap = mapper.readValue(output, Map.class);
            Map dailyWeatherInfo = (Map)responseJsonMap.get("daily");
            List dailyData = (List) dailyWeatherInfo.get("data");

            System.out.println(output);

            weatherInfo.setZipcode(zipcode).setLatitude(placeLatitude).setLongitude(placeLongitude)
                    .setCity(place.getPlaceName());

        } catch (Exception e) {

            e.printStackTrace();

        }

        return weatherInfo;
    }

    private void setPostalDB(){
        if(postalDB == null) {
            postalDB = PostalDbFactory.getPostalDb();
        }
    }

}
