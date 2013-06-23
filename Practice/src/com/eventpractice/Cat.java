package com.eventpractice;

import java.util.EventObject;


public class Cat extends Animal{

	public Cat(){
		addEventListener(new CatListener());
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("purr");
	}

	@Override
	public void smile() {
		// TODO Auto-generated method stub
		System.out.println("meow");
	}
	
	
	private class CatListener implements CustomEventListener{


		@Override
		public void eventOccurred(EventObject event) {
			WeatherEvent w = (WeatherEvent) event;
			if(w.getWeather().getWeather() == "rain"){
				cry();
			}else{
				smile();
			}
		}

	}

}


