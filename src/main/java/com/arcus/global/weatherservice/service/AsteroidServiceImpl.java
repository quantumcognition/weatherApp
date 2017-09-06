package com.arcus.global.weatherservice.service;

import com.arcus.global.weatherservice.domain.WeatherInfo;
import com.arcus.global.weatherservice.domain.asteroids;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.quickgeo.Place;
import org.quickgeo.PostalDb;
import org.quickgeo.PostalDbFactory;

import java.util.List;
import java.util.Map;

public class AsteroidServiceImpl {

    private PostalDb postalDB;

  //  @Override
    public asteroids getClosestAsteroidUsing(String startDate, String endDate){
        setPostalDB();
        asteroids asteroids = new asteroids();
        String start = asteroids.getStartDate();
        String end = asteroids.getEndDate();

        try {

            Client client = Client.create();
            WebResource webResource = client
                    .resource("https://api.nasa.gov/neo/rest/v1/feed?start_date=" + start + "&end_date=" + end + "2015-09-08&api_key=u1Srkg2089SrMDaP25WVHFotRfJjhOT6YDDWG9u2");

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

        }
        catch(Exception e) {
            e.printStackTrace();

        }
        return asteroids;
    }

    private void setPostalDB(){
        if(postalDB == null) {
            postalDB = PostalDbFactory.getPostalDb();
        }
    }

}
