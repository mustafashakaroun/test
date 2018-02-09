package com.mustafa.main;

import java.util.ArrayList;
import java.util.Arrays;
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
		System.out.println("3-select product");
		System.out.println("4-show my cart ");
		System.out.println("5- pay");
		System.out.println("-------------------------------------------");
		
		System.out.println("your choice is: ");
		n = scanner.nextInt();
		if(n<1 || n>5){
			System.out.println("Please choose between 1 and 5");
			continue;
		}

		switch (n){
		case 1 : 
			printAllProducts(allProducts);
			break;
		case 2 : 
			printProductsWithDiscounts(allProducts);
			break;
		case 3 : 
			selectProduct(allProducts, person1);
			break;
		case 4 :
			break;
		case 5 :
			break;
		}
		}while(n!=5);
	}

	
	private static void selectProduct(ArrayList<Product> allProducts, Person person) {
	
		printAllProducts(allProducts);
		System.out.println("Please choose product by number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n<0 || n>allProducts.size()-1){
			System.out.println("bala mantashe");
			return;
		}
		Product selectedProduct = allProducts.remove(n-1);
		person.getInvoice().getProducts().add(selectedProduct);
}


	private static void printAllProducts(ArrayList<Product> allProducts) {
		for(int i=0; i<allProducts.size(); i++){
			System.out.println(i+1 + " " + allProducts.get(i));
		}		
	}
	
	private static void printProductsWithDiscounts(ArrayList<Product> allProducts) {
		for(int i=0; i<allProducts.size(); i++){
			if(allProducts.get(i).getDiscount() > 0){
			System.out.println(i+1 + " " + allProducts.get(i));
			}
		}		
	}
	
	

}
