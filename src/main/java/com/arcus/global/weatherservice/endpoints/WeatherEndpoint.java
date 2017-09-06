package com.arcus.global.weatherservice.endpoints;


import com.arcus.global.weatherservice.domain.WeatherInfo;
import com.arcus.global.weatherservice.service.WeatherService;
import com.arcus.global.weatherservice.service.WeatherServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/api/weather")
public class WeatherEndpoint {

    private WeatherService weatherService;

    @GET
    @Path("/zipcode/{zipcode}")
    @Produces({"application/xml","application/json"})

    public WeatherInfo welcomeAppInfo(@PathParam("zipcode") String zipcode) {
        setWeatherService();
        //WeatherInfo weatherInfo = new WeatherInfo();
        //weatherInfo.setZipcode(zipcode);
        return weatherService.getWeatherSummaryForCityByTime(zipcode, "");

    }

    private void setWeatherService(){
        if(weatherService == null) {
            weatherService = new WeatherServiceImpl();
        }
    }

}
