package com.bridgelabz;

import java.util.Scanner;

public class StockAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StockPortfolio stock = new StockPortfolio();
		while (true) {
			System.out.println("Enter the choice !!! \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> stock.addStocks();// -> is lambda expression
			case 2 -> stock.stockReport();
			case 3 -> {
				System.out.println("exiting");
				System.exit(0);
			}
			default -> System.out.println("invalid input");
			}

		}

	}
}
