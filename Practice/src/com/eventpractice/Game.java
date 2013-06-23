package com.eventpractice;

import java.util.ArrayList;

public class Game extends AbstractObservable{
	public Game(){
		observers = new ArrayList<Observer>();
	}
	
    public synchronized void dispatchNewGameEvent(String s) {
    	GameEvent e = new GameEvent(this, s);
        notifyObservers(e);
    }
}
