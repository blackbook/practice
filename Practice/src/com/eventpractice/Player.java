package com.eventpractice;

import java.util.EventObject;

public class Player extends AbstractObserver{

	public Player(){
		addEventListener(new PlayerListener());
	}
	
	
	private class PlayerListener implements CustomEventListener{


		@Override
		public void eventOccurred(EventObject event) {
			GameEvent e = (GameEvent) event;
			if(e.getType() == "go"){
				System.out.println("it is my turn!");
			}else if(e.getType() == "moved"){
				System.out.println("i have moved!");
			}else{
				System.out.println("i have been attacked!");
			}
		}
		
	}
}
