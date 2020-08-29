package com.homework.switch1;

import java.util.Scanner;

public class TestSwitch2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();
		
		if(input.equalsIgnoreCase("Black")){
			System.out.println("You must be a goth ");
		}
		else if (input.equalsIgnoreCase("white")){
			System.out.println("You are a very pure person.");
		}
		
		else if (input.equalsIgnoreCase("red")){
			System.out.println("You are fun and outgoing.");
		}
		else if(input.equalsIgnoreCase("blue")) {
			System.out.println("You are not a chelsea fan are you?");
			System.out.println("You are not a chelsea fan are you?");
			System.out.println("You are not a chelsea fan are you?");
			System.out.println("You are not a chelsea fan are you?");
		}
		
	}
}
