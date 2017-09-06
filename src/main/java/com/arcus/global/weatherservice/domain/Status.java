package com.arcus.global.weatherservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Status {

    private String appName;
    private String appVersion;
    private String appType;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

}
