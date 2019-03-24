package com.homework.exercise2;

public class Even {
	public void showEvenNumbers(){

		for(int i = 1;i<=50;i++){
			if(i%2==0){
			System.out.println(i);
			}

		}
	}
	public static void main(String[] args) {
		
		Even even = new Even();
		even.showEvenNumbers();
		
	}

}
