package com.eventpractice;

import java.util.EventObject;
public class WeatherEvent extends EventObject {
    private Weather weather;
    
    public WeatherEvent( Object source, Weather w ) {
        super( source );
        weather = w;
    }
    public Weather getWeather() {
        return weather;
    }
    
}