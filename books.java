package com.oops;

public class Books {
	// state
	private int noOfCopies;

	void setnoOfCopies(int noOfCopies) {
		System.out.println(" noOfCopies ");
		System.out.println(" this.noOfCopies ");
		this.noOfCopies = noOfCopies;
	}

	int getnoOfCopies() {
		return this.noOfCopies;

	}
	void start() {
		System.out.println(" Read ");
	}

}
