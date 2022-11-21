package com.dhiren;

public class MathDemo {
	public static void main(String[] args) {
		mathDemo();
	}

	private static void mathDemo() {
		// Lottery [1, 100]
		double rndm = Math.random();
		int winner = (int) (rndm * 100);
		System.out.println(rndm);
		System.out.println(winner);

		System.out.println(Math.round(rndm * 10));
		System.out.println(Math.ceil(rndm * 10)); // round up
		System.out.println(Math.floor(rndm * 10)); // round down

		double idf = Math.log(100 / 8);
		System.out.println("idf is: " + idf);
	}

}
