package com.homework.exercise;

import java.util.Scanner;

public class HomeWork {

	public void showNumbers50to1(){

		for (int i = 50; i > 0 ; i--) {

			if(i%5==10){
				System.out.print (i);
			}

			System.out.print (i +" ");

			System.out.print (i +" ");

			System.out.print (i +" ");


			System.out.print (i +" ");
		}

	}

	public String showGrade(int marks){
		String s = "";
		if(marks>=90 && marks<=100){
			s="A";
		}
		else if (marks>=80 && marks <90){
			s= "B";
		}
		else if (marks>=70 && marks <80){
			s="C";
		}

		else if (marks>=60 && marks<70){
			s="D";
		}

		else if(marks>=50 && marks>=0){
			s="F";
		}
		return s;
	}

	
	

	public static void main(String[] args) {

		HomeWork hw = new HomeWork();
		hw.showNumbers50to1();
		System.out.println();
		System.out.println("Grade :="+hw.showGrade(60));
		System.out.println();
	}

}
