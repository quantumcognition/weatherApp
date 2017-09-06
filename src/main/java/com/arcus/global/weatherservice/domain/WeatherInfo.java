package com.arcus.global.weatherservice.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherInfo {
    private String date;
    private String zipcode;
    private String city;
    private String latitude;
    private String longitude;
    private String summary;
    private String sunsriseTime;
    private String sunsetTime;
    private String temperatureMin;
    private String temperatureMax;
    private String humidity;
    private String windSpeed;
    private String pressure;
    private String visibility;

    public String getDate() {
        return date;
    }

    public WeatherInfo setDate(String date) {
        this.date = date;
        return this;
    }

    public String getZipcode() {
        return zipcode;
    }

    public WeatherInfo setZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public WeatherInfo setCity(String city) {
        this.city = city;
        return this;
    }

    public String getLatitude() {
        return latitude;
    }

    public WeatherInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    public String getLongitude() {
        return longitude;
    }

    public WeatherInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public WeatherInfo setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getSunsriseTime() {
        return sunsriseTime;
    }

    public WeatherInfo setSunsriseTime(String sunsriseTime) {
        this.sunsriseTime = sunsriseTime;
        return this;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public WeatherInfo setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
        return this;
    }

    public String getTemperatureMin() {
        return temperatureMin;
    }

    public WeatherInfo setTemperatureMin(String temperatureMin) {
        this.temperatureMin = temperatureMin;
        return this;
    }

    public String getTemperatureMax() {
        return temperatureMax;
    }

    public WeatherInfo setTemperatureMax(String temperatureMax) {
        this.temperatureMax = temperatureMax;
        return this;
    }

    public String getHumidity() {
        return humidity;
    }

    public WeatherInfo setHumidity(String humidity) {
        this.humidity = humidity;
        return this;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public WeatherInfo setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public String getPressure() {
        return pressure;
    }

    public WeatherInfo setPressure(String pressure) {
        this.pressure = pressure;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public WeatherInfo setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

}
