package com.example.coolweather.gson;

/**
 * Created by wanghan on 2018/8/18.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
