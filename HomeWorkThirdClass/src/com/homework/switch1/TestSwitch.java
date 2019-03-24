package com.homework.switch1;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter Age : ");

		int age = input.nextInt();

		switch(age/10){
		case 0: System.out.println("Range:0-9");
		break;
		case 1:System.out.println("Range:10-19");
		break;

		case 2:System.out.println("Range:20-29");
		break;

		case 3:System.out.println("Range:30-39");
		break;

		case 4:System.out.println("Range:40-49");
		break;
		default: System.out.println("50 or over 50");
		break;

		}
		
		
		
	}

}
