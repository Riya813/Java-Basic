package com.oops;

public class InstancesMotorBike {
	// state
	private int speed;// member variable

	// behavior
	// methods
	// inputs - int speed
	// outputs - void
	// name - setSpeed
	void setspeed(int speed) {// local variable
		if (speed > 0) {
			this.speed = speed;
		}

		// System.out.println(speed);
		// System.out.println(this.speed);
	}

	int getspeed() {
		return this.speed;
	}

	public void increasespeed(int howMuch) {
		setspeed(this.speed + howMuch);
	}

	public void decreasespeed(int howMuch) {
		// if (this.speed - howMuch > 0)
		setspeed(this.speed - howMuch);

	}
	void start() {

		System.out.println("car starts");
	}

}

