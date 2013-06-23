package com.eventpractice;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Nature nature = new Nature();
		nature.addObserver(cat);
		nature.addObserver(dog);
		Weather rain = new Weather("rain");
		Weather sun = new Weather("sun");
		nature.dispatchNewWeatherEvent(rain);
		nature.dispatchNewWeatherEvent(sun);
		
		Game g = new Game();
		Player p = new Player();
		g.addObserver(p);
		g.dispatchNewGameEvent("go");
		g.dispatchNewGameEvent("moved");
		g.dispatchNewGameEvent("attack!");
	}

}
