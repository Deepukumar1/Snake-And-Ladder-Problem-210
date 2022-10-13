package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake and Ladder Program");
		 int startPosition = 0;
	        int diceNumber = (int) Math.floor(Math.random() * 10) % 6+1;
	        System.out.println("Dice Roll is:"+diceNumber);
	        System.out.println(" Start position is: "+startPosition);
	}
}
