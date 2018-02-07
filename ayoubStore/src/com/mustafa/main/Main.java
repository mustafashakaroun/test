package com.mustafa.main;

import java.util.Scanner;

import com.mustafa.models.HeadPhones;
import com.mustafa.models.Keyboard;
import com.mustafa.models.Laptop;
import com.mustafa.models.Mouse;
import com.mustafa.models.Person;
import com.mustafa.models.Printer;
import com.mustafa.models.Product;
import com.mustafa.models.Speaker;
import com.mustafa.models.USB;

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
		
		HeadPhones headphones1 = new HeadPhones(2.5,10,"L25410");
		HeadPhones headphones2 = new HeadPhones(0,10, "L24611");
		
		Keyboard keyboard1 = new Keyboard(10, 20, "L24564", false);
		Keyboard keyboard2 = new Keyboard(0, 30, "L24566", true);
		
		Laptop laptop1 = new Laptop(50, 3000, "L56884", "SSD", "SDRAM", "Quad-Core Xeon", "apple");
		Laptop laptop2 = new Laptop(20, 1500, "L56885", "SSD 1TB", "SDRAM", "Core i7", "Toshiba");
		
		Mouse mouse1 = new Mouse(10, 10, "L56214", false);
		Mouse mouse2 = new Mouse(5, 20, "L56215", true);
		
		Printer printer1 = new Printer(20, 70, "L546541", "HP");
		Printer printer2 = new Printer(30, 100, "L546545", "Toshiba");
		
		Speaker speaker1 = new Speaker(3.8, 20, "L546546");
		Speaker speaker2 = new Speaker(0, 30, "L5465487");
		
		USB usb1 = new USB(30, 20, "L5465", "16 GB");
		USB usb2 = new USB(0, 80, "L54655", "120 GB");
		
		
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
