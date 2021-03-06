package com.mustafa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

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

	// Welcome To Ayoub Store
	// Please enter your first name
	// Ali
	// Please enter your last name
	// Ammar
	// please enter you phone number
	// 70025207
	// Welcome Ali Ammar , please select what you want
	// 1-show all products with salaries
	// 2-show products with offer
	// 3-show my cart
	// 4-select product
	// 5- pay
	// -------------------------------------
	// thanks for purchase from ayoub store
	// 2 : mouse 22$
	// 1 : keyboard 15$
	// 1 : laptop Hp Pavillion 16gb ram , 1 Tb hdd , 240 ssd 900$
	// total : 937$
	// we hope that we will see you again :)

	private static Scanner scanner = new Scanner(System.in);
	private static List<Person> persons = new ArrayList<>();

	public static void main(String[] args) {

//		String url = "jdbc:sqlserver://DESKTOP-KEUPE6C\\DESKTOP-KEUPE6C;databaseName=PcStore;integratedSecurity=true";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // ka2ino 3m na3mil (new from SQL).
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pcstore", "root", "");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement(); // L statement ta 7atta n2alli3 SQL commands.
			
			ResultSet clientList = stmt.executeQuery("select * from client");
			while(clientList.next()){
				String a = clientList.getString("firstName");
				String b = clientList.getString("lastName");
				String c = clientList.getString("phone");
				Person person = new Person();
				person.setFirstName(a);
				person.setLastName(b);
				person.setPhoneNumber(c);
				persons.add(person);
				}

			boolean quit = false;
			while(!quit){
			ResultSet idMax = stmt.executeQuery("select max(ID) max_id from client");
			int id = 0;
			if(idMax.next()){
				id = idMax.getInt("max_id");
			}
			id++;
			
//			int id;
//			String name;
//			String lastname;
//			String phone;
//			String username;
//			String password;
//			
			
			
//			ResultSet rs = stmt.executeQuery("select * from client");
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
		

		HeadPhones headphones1 = new HeadPhones(2.5, 20, "L25410", "headphone apple");
		HeadPhones headphones2 = new HeadPhones(0, 10, "L24611", "headphone samsung");

		Keyboard keyboard1 = new Keyboard(10, 20, "L24564", "mormal keyboard");
		Keyboard keyboard2 = new Keyboard(0, 30, "L24566", "wirless keyboard2");

		Laptop laptop1 = new Laptop(50, 3000, "L56884", "SSD", "SDRAM", "Quad-Core Xeon", "apple");
		Laptop laptop2 = new Laptop(20, 1500, "L56885", "SSD 1TB", "SDRAM", "Core i7", "Toshiba");

		Mouse mouse1 = new Mouse(10, 10, "L56214", "normal mouse");
		Mouse mouse2 = new Mouse(5, 20, "L56215", "wirless mouse");

		Printer printer1 = new Printer(20, 70, "L546541", "printer HP");
		Printer printer2 = new Printer(30, 100, "L546545", "printer Toshiba");

		Speaker speaker1 = new Speaker(3.8, 20, "L546546", "normal speaker");
		Speaker speaker2 = new Speaker(0, 30, "L5465487", "original speaker");

		USB usb1 = new USB(30, 20, "L5465", "sundisk usb", "16 GB");
		USB usb2 = new USB(0, 80, "L54655", "apple usb", "120 GB");

		mouse2.setSilent(true);

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

		System.out.println("Welcome To Ayoub Store");
		System.out.println("Please enter your first name");
		String inputFirstName = scanner.nextLine();
		System.out.println("Please enter your last name");
		String inputLastName = scanner.nextLine();
		System.out.println("please enter you phone number");
		String inputPhoneNumber = scanner.nextLine();
		Person person = Person.createPerson(inputFirstName, inputLastName, inputPhoneNumber);
		
		String query ="insert into client values("+id+",\""+inputFirstName+"\",\""+inputLastName+"\",\""+inputPhoneNumber+"\",\""+person.getUserName()+"\",\""+person.getPassword()+"\")";
		stmt.execute(query);
		
		ResultSet newClient = stmt.executeQuery("select firstName, lastName, phone from client where ID = " + id);
		String a = newClient.getString("firstName");
		String b = newClient.getString("lastName");
		String c = newClient.getString("phone");
		Person person2 = new Person();
		person2.setFirstName(a);
		person2.setLastName(b);
		person2.setPhoneNumber(c);
		if(!persons.contains(person2)){
			persons.add(person2);
		}else{
			System.out.println(person2 + " is already exist");
		}
		
		System.out.println("if you want quit, press 0");
		System.out.println("if you want quit, press 1");
		int m;
		m = scanner.nextInt();
		scanner.nextLine();
		if(m == 0){
			quit = true;
		}else{
			continue;
		}
			}
		con.close();
		
		/*boolean flag = true;
		while (flag) {
			System.out.println("Please enter your username: ");
			String inputUsername = scanner.nextLine();
			if (!person.getUserName().equals(inputUsername)) {
				continue;
			} else {
				flag = false;
			}
		}
		while (!flag) {
			System.out.println("Please enter your password: ");
			String inputPassword = scanner.nextLine();
			if (!person.getPassword().equals(inputPassword)) {
				continue;
			} else {
				flag = true;
			}
		}

		int n;
		do {
			System.out.println("------------------------------------------");
			System.out.println("Welcome " + person.fullName() + ", please select what you want");
			System.out.println("1-show all products with salaries");
			System.out.println("2-show products with offer");
			System.out.println("3-select product");
			System.out.println("4-show my cart ");
			System.out.println("5- pay");
			System.out.println("-------------------------------------------");

			System.out.println("your choice is: ");
			n = scanner.nextInt();
			if (n < 1 || n > 5) {
				System.out.println("Please choose between 1 and 5");
				continue;
			}

			switch (n) {
			case 1:
				printAllProducts(allProducts);
				break;
			case 2:
				printProductsWithDiscounts(allProducts);
				break;
			case 3:
				selectProduct(allProducts, person);
				break;
			case 4:
				selectedProduct(person);
				break;
			case 5:
				System.out.println("thanks for purchase from ayoub store");
				selectedProduct(person);
				System.out.println("Total price: " + person.getInvoice().getTotalSalary() + " $");
				break;
			}
		} while (n != 5);
		*/
		} catch (Exception e) {
			System.out.println(e);
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	private static void printAllProducts(ArrayList<Product> allProducts) {
		for (int i = 0; i < allProducts.size(); i++) {
			System.out.println(i + 1 + " " + allProducts.get(i));
		}
	}

	private static void printProductsWithDiscounts(ArrayList<Product> allProducts) {
		for (int i = 0; i < allProducts.size(); i++) {
			if (allProducts.get(i).getDiscount() > 0) {
				System.out.println(i + 1 + " " + allProducts.get(i));
			}
		}
	}

	private static void selectProduct(ArrayList<Product> allProducts, Person person) {

		printAllProducts(allProducts);
		System.out.println("Please choose product by number: ");
		int n = scanner.nextInt();
		if (n < 0 || n > allProducts.size()) {
			System.out.println("bala mantashe");
			return;
		}
		Product selectedProduct = allProducts.remove(n - 1);
		person.getInvoice().getProducts().add(selectedProduct);

		double price = (double) selectedProduct.getSalary();
		person.getInvoice().modifyPrice(price);
	}

	private static void selectedProduct(Person person) {
		for (int i = 0; i < person.getInvoice().getProducts().size(); i++) {
			Product selectedProduct = person.getInvoice().getProducts().get(i);
			System.out.println(
					i + 1 + "       " + selectedProduct.getName() + "      " + selectedProduct.getSalary() + " $");
		}
	}

}
