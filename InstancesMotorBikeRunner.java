package com.oops;

public class InstancesMotorBikeRunner {

	public static void main(String[] args) {
		InstancesMotorBike Maruti = new InstancesMotorBike();
		InstancesMotorBike Ford = new InstancesMotorBike();
		Maruti.start();
		Ford.start();

		Maruti.setspeed(100);
		Maruti.increasespeed(100);
		Maruti.decreasespeed(250);
		// int Marutispeed = Maruti.getspeed();// get speed
		// Marutispeed = Marutispeed + 100; // increase it by 100
		// Maruti.setspeed(Marutispeed);// set speed

		System.out.println(Maruti.getspeed());

		Ford.setspeed(200);
		Ford.increasespeed(50);
		Ford.decreasespeed(500);
		// int Fordspeed = Ford.getspeed();// get speed
		// Fordspeed = Fordspeed + 100; // increase it by 100
		// Ford.setspeed(Fordspeed);// set speed
		System.out.println(Ford.getspeed());

	}

}
