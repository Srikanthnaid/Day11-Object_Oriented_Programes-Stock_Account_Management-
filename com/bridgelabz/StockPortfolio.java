package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
	List<Stock> stocklist  = new  ArrayList<Stock>();
	static Scanner scanner = new Scanner(System.in);
	Stock stock = new Stock();//Creating object for Stock class to set and get values
	
	//addStock() method using to add number of stocks
	public void addStocks() {
		int numOfStocks = 0;
		System.out.print("Enter how many Stocks you want to add: ");
		numOfStocks = scanner.nextInt();
		for (int i = 0; i < numOfStocks; i++) {
			System.out.println("Enter the stock name");
			stock.setStockNames(scanner.next());

			System.out.println("Enter the number of shares present");
			stock.setNumOfShare(scanner.nextDouble());

			System.out.println("Enter the share price");
			stock.setSharePrice(scanner.nextDouble());
			//here added contact details to list
			stocklist.add(stock);
		}
	}
	//stockReport() method using to provide report for stock value
	public void stockReport() {
		Double sum = 0.0;
		System.out.println("************ StockReport ***************");
		System.out.println("stock name            Number of shares         Stock price        Total price of stock ");
		for (int i = 0; i < stocklist.size(); i++) {
			Stock stock = stocklist.get(i);
			double totalPrice = stock.getNumOfShare() * stock.getSharePrice();
			totalPrice = sum + totalPrice;
			System.out.format("%-10s            %-10.3f               %-10.3f         %-10.3f\n",stock.getStockNames(),stock.getNumOfShare(),stock.getSharePrice(),totalPrice);
		}

	}

}
