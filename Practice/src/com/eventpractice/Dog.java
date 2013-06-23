package com.eventpractice;

import java.util.EventObject;


public class Dog extends Animal{

	public Dog(){
		addEventListener(new DogListener());
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("grr");
	}

	@Override
	public void smile() {
		// TODO Auto-generated method stub
		System.out.println("woof");
	}
	
	
	private class DogListener implements CustomEventListener{

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


