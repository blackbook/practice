package com.eventpractice;

import java.util.ArrayList;


public class Nature extends AbstractObservable{

	public Nature(){
		observers = new ArrayList<Observer>();
	}
	
    public synchronized void dispatchNewWeatherEvent(Weather w) {
    	WeatherEvent e = new WeatherEvent(this, w);
        notifyObservers(e);
    }
}
