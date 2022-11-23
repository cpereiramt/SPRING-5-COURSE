package com.claytonpereira.springDemo;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach(null);

		System.out.println(theCoach.getDailyWorkout());
	}

}
