package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * declare a variable rate.
		 * If rate is more than 5--> I am not buying a house
		 * 
		 */
	
		double mortgageRate=5.5;
		
		if (mortgageRate>5)
											
			System.out.println("I am not buying a house");
		
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 * 
		 */
		
		int num1=99;
		int num2=10;
		
		if(num1>num2)	{
			System.out.println(num1+" is bigger than "+num2);
			
		}
		
		/*
		 * declare temperature, 
		 * if temp is higher than 75-> I will go for a walk
		 */
		 
		int temp=78;
		
		if (temp>75) {
			
			System.out.println("I will go for a walk");
			
		}
			
		else { //otherwise. Code comes to else {}
			//when condition is false
		System.out.println("I am going to study Java");}
		
		char gender='f';
		
		if (gender=='f') {
			
			System.out.println("You like shopping");
			
		}else {
			
			System.out.println("You like wathcing sports");
		}
	System.out.println("------------------------");
	
		String browser="chrome";
		if (browser.equals("chrome")) {
			
			System.out.println("All test cases will be executed on chrome");
			}else {
				System.out.println("I am not exeuting my test cases");
				System.out.println("Reason - wrong browser");
			}
		
		}
			
			

}