package snakeandladder;

import java.util.Random;

public class Dice {

	public static int roll() {

		int n = -1;
//		n = (int)(Math.random()*10);
//
//		while(n<1)
//			n = (int)(Math.random()*10);
//		n = (n%6)+1;

		Random r = new Random();

		n = r.nextInt(6) + 1;

		return n;
	}

	public static void main(String[] args) {
		System.out.println(roll());
	}
}
