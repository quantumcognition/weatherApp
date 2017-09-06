package com.arcus.global.weatherservice.service;

import com.arcus.global.weatherservice.domain.asteroids;
import org.quickgeo.Place;

public interface AsteroidService {

    public asteroids getClosestAsteroidUsing(String startDate, String endDate);

}
