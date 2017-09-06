package com.arcus.global.weatherservice.service;

import com.arcus.global.weatherservice.domain.WeatherInfo;
import org.quickgeo.Place;

import javax.ws.rs.core.Response;

public interface WeatherService {

    public Place getPlaceByZipcode(String zipcode);

    public WeatherInfo getWeatherSummaryForCityByTime(String zipcode, String time);


}
