package com.oops;

public class BooksRunner {

	public static void main(String[] args) {
		Books ArtOfComputerProgramming = new Books();
		Books EffectiveJava = new Books();
		Books CleanCode = new Books();
		ArtOfComputerProgramming.start();
		EffectiveJava.start();
		CleanCode.start();

		ArtOfComputerProgramming.setnoOfCopies(100);
		// System.out.println(ArtOfComputerProgramming.getnoOfCopies());
		// EffectiveJava.setnoOfCopies(50);
		// System.out.println(EffectiveJava.getnoOfCopies());
		// CleanCode.setnoOfCopies(150);
		// System.out.println(CleanCode.getnoOfCopies());

	}

}
