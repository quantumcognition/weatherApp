package com.arcus.global.weatherservice.endpoints;

import com.arcus.global.weatherservice.domain.Status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class StatusEndpoint {

    @GET
    @Produces({"application/xml","application/json"})

    public Status welcomeAppInfo() {
        Status appStatus = new Status();
        appStatus.setAppName("Weather Service");
        appStatus.setAppVersion("1.0.0");
        appStatus.setAppType("Web Service");
        return appStatus;

    }

}
