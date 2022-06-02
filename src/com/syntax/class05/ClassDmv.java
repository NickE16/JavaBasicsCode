package com.syntax.class05;

import java.util.Scanner;

public class ClassDmv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age=scan.nextInt();
		
		if (age>=18) {
			System.out.println("Issue a drifer license");
		} else {
			System.out.println("we will offer you a learner's permit");
		}
	
	}

}
