package com.bridgelabz;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to the Snake and Ladder Program");
		System.out.println("Player Check Option: ");
        int position = 0;

        int diceNumber = (int) Math.floor(Math.random() * 10) % 6+1;

        System.out.println("Dice Roll is:"+diceNumber);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("Player option is : " + option);

        switch (option) {
            case 1:
                position = diceNumber + position;
                System.out.println("Ladder");
                System.out.println("Position for the player after the ladder is : " + position);
                break;

            case 2:
                position = position - diceNumber;
                System.out.println("Snack");
                System.out.println("Position for the player after the Snake is : " + position);
                break;

            default:
                System.out.println("No play");
        }
	}
}
