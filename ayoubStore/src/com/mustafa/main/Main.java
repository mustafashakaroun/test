package com.mustafa.main;

import java.util.ArrayList;
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
		
		HeadPhones headphones1 = new HeadPhones(2.5,20,"L25410", "headphone apple");
		HeadPhones headphones2 = new HeadPhones(0,10, "L24611", "headphone samsung");
		
		Keyboard keyboard1 = new Keyboard(10, 20, "L24564", "mormal keyboard");
		Keyboard keyboard2 = new Keyboard(0, 30, "L24566", "wirless keyboard2");
		
		Laptop laptop1 = new Laptop(50, 3000, "L56884", "SSD", "SDRAM", "Quad-Core Xeon", "apple");
		Laptop laptop2 = new Laptop(20, 1500, "L56885", "SSD 1TB", "SDRAM", "Core i7", "Toshiba");
		
		Mouse mouse1 = new Mouse(10, 10, "L56214", "normal mouse");
		Mouse mouse2 = new Mouse(5, 20, "L56215", "wirless mouse");
		
		Printer printer1 = new Printer(20, 70, "L546541", "printer HP");
		Printer printer2 = new Printer(30, 100, "L546545", "printer Toshiba");
		
		Speaker speaker1 = new Speaker(3.8, 20, "L546546","normal speaker");
		Speaker speaker2 = new Speaker(0, 30, "L5465487", "original speaker");
		
		USB usb1 = new USB(30, 20, "L5465", "16 GB", "sundisk usb");
		USB usb2 = new USB(0, 80, "L54655", "120 GB", "apple usb");
		
		ArrayList<Product> allProducts = new ArrayList<Product>();
		allProducts.add(speaker2);
		allProducts.add(speaker1);
		allProducts.add(printer2);
		allProducts.add(printer1);
		allProducts.add(mouse2);
		allProducts.add(mouse1);
		allProducts.add(keyboard2);
		allProducts.add(keyboard1);
		allProducts.add(headphones2);
		allProducts.add(headphones1);
		allProducts.add(usb2);
		allProducts.add(usb1);
		allProducts.add(laptop2);
		allProducts.add(laptop1);
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Welcome To Ayoub Store");
		System.out.println("Please enter your first name");
		String inputFirstName = scanner.nextLine();
		System.out.println("Please enter your last name");
		String inputLastName = scanner.nextLine();
		System.out.println("please enter you phone number");
		String inputPhoneNumber = scanner.nextLine();
		Person person1 = new Person(inputFirstName,inputLastName,inputPhoneNumber);
		
		int n;
		do{
		System.out.println("------------------------------------------");
		System.out.println("Welcome " + person1.fullName() + ", please select what you want");
		System.out.println("1-show all products with salaries");
		System.out.println("2-show products with offer");
		System.out.println("3-show my cart");
		System.out.println("4-select product");
		System.out.println("5- pay");
		System.out.println("-------------------------------------------");
		
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("your choice is: ");
		n = scanner1.nextInt();
		if(n<1 || n>5){
			System.out.println("Please choose between 1 and 5");
			continue;
		}

		if(n == 1){
			System.out.println("Product1: " + headphones1.getName() + "                    " + headphones1.getSalary() + " $   with discount " + headphones1.getDiscount() + " %");
			System.out.println("Product2: " + headphones2.getName() + "                    " + headphones2.getSalary() + " $   with discount " + headphones1.getDiscount() + " %");
			System.out.println("Product3: " + keyboard1.getName() + "                      " + keyboard1.getSalary() + " $   with discount " +keyboard1.getSalary() + " %");
			System.out.println("Product4: " + keyboard2.getName() + "                      " + keyboard2.getSalary() + " $   with discount " +keyboard2.getSalary() + " %");
			System.out.println("Product5: " + laptop1.getName() + "  " + laptop1.getCPU() + "  " + laptop1.getHardDisk() + "  " + laptop1.getRAM() + "     " + laptop1.getSalary() + " $   with discount " + laptop1.getDiscount() + " %");
			System.out.println("Product6: " + laptop2.getName() + "  " + laptop2.getCPU() + "  " + laptop2.getHardDisk() + "  " + laptop2.getRAM() + "     " + laptop2.getSalary() + " $   with discount " + laptop2.getDiscount() + " %");
			System.out.println("Product7: " + mouse1.getName() + "                    " + mouse1.getSalary() + " $   with discount " + mouse1.getDiscount() + " %");
			System.out.println("Product8: " + mouse2.getName() + "                    " + mouse2.getSalary() + " $   with discount " + mouse2.getDiscount() + " %");
			System.out.println("Product9: " + printer1.getName() + "                    " + printer1.getSalary() + " $   with discount " + printer1.getDiscount() + " %");
			System.out.println("Product10: " + printer2.getName() + "                    " + printer2.getSalary() + " $   with discount " + printer2.getDiscount() + " %");
			System.out.println("Product11: " + speaker1.getName() + "                    " + speaker1.getSalary() + " $   with discount " + speaker1.getDiscount() + " %");
			System.out.println("Product12: " + speaker2.getName() + "                    " + speaker2.getSalary() + " $   with discount " + speaker2.getDiscount() + " %");
			System.out.println("Product13: " + usb1.getName() + "                    " + usb1.getSalary() + " $   with discount " + usb1.getDiscount() + " %");
			System.out.println("Product14: " + usb2.getName() + "                    " + usb2.getSalary() + " $   with discount " + usb2.getDiscount() + " %");
		}else if(n == 2){
			System.out.println("Product1: " + headphones1.getName() + "                    " + headphones1.getSalary() + " $   with discount " + headphones1.getDiscount() + " %");
			System.out.println("Product3: " + keyboard1.getName() + "                      " + keyboard1.getSalary() + " $   with discount " +keyboard1.getSalary() + " %");
			System.out.println("Product5: " + laptop1.getName() + "  " + laptop1.getCPU() + "  " + laptop1.getHardDisk() + "  " + laptop1.getRAM() + "     " + laptop1.getSalary() + " $   with discount " + laptop1.getDiscount() + " %");
			System.out.println("Product6: " + laptop2.getName() + "  " + laptop2.getCPU() + "  " + laptop2.getHardDisk() + "  " + laptop2.getRAM() + "     " + laptop2.getSalary() + " $   with discount " + laptop2.getDiscount() + " %");
			System.out.println("Product7: " + mouse1.getName() + "                    " + mouse1.getSalary() + " $   with discount " + mouse1.getDiscount() + " %");
			System.out.println("Product8: " + mouse2.getName() + "                    " + mouse2.getSalary() + " $   with discount " + mouse2.getDiscount() + " %");
			System.out.println("Product9: " + printer1.getName() + "                    " + printer1.getSalary() + " $   with discount " + printer1.getDiscount() + " %");
			System.out.println("Product10: " + printer2.getName() + "                    " + printer2.getSalary() + " $   with discount " + printer2.getDiscount() + " %");
			System.out.println("Product11: " + speaker1.getName() + "                    " + speaker1.getSalary() + " $   with discount " + speaker1.getDiscount() + " %");
			System.out.println("Product13: " + usb1.getName() + "                    " + usb1.getSalary() + " $   with discount " + usb1.getDiscount() + " %");
		}
		}while(n!=5);
	}
	
	

}
