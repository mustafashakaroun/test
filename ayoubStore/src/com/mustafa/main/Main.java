package com.mustafa.main;

import java.util.Scanner;

import com.mustafa.models.Person;
import com.mustafa.models.Product;

public class Main {
	
//	Welcome To Ayoub Store 
//	Please enter your first name
//	Ali
//	Please enter your last name
//	Ammar
//	please enter you phone number
//	70025207
//	Welcome Ali Ammar , please select what you want
//	1-show all products with salaries
//	2-show products with offer
//	3-show my cart
//	4-select product
//	5- pay
//	-------------------------------------
//	thanks for purchase from ayoub store
//	2 : mouse                                                   22$
//	1 : keyboard                                                15$
//	1 : laptop Hp Pavillion 16gb ram , 1 Tb hdd , 240 ssd       900$
//	total : 937$
//	we hope that we will see you again :)
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Welcome To Ayoub Store");
		System.out.println("Please enter your first name");
		String inputFirstName = scanner.nextLine();
		System.out.println("Please enter your last name");
		String inputLastName = scanner.nextLine();
		System.out.println("please enter you phone number");
		String inputPhoneNumber = scanner.nextLine();
		Person person1 = new Person(inputFirstName,inputLastName,inputPhoneNumber);
		
		System.out.println("Welcome " + person1.fullName() + ", please select what you want");
		System.out.println("1-show all products with salaries");
		System.out.println("2-show products with offer");
		System.out.println("3-show my cart");
		System.out.println("4-select product");
		System.out.println("5- pay");
		
	}

}
