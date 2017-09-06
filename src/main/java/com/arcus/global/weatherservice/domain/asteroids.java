package com.arcus.global.weatherservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class asteroids {

    String startDate = "2017-08-14";
    String endDate = "2017-08-20";

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
