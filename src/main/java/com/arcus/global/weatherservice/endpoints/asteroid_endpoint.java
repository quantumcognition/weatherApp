package com.arcus.global.weatherservice.endpoints;



import com.arcus.global.weatherservice.domain.asteroids;
import com.arcus.global.weatherservice.service.AsteroidService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/api/asteroid")
public class asteroid_endpoint {

    private AsteroidService asteroidservice;
    @GET
    @Path("/asteroid")
    @Produces({"application/xml","application/json"})

    public asteroids asteroidsInfo(String startDate, String endDate) {
            asteroids asteroidsInfo = new asteroids();
         // asteroidsInfo.setStartDate("startdate");
          return asteroidsInfo;

    }

}
