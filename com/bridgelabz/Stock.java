package com.bridgelabz;

public class Stock {
	// class based variables
	private String stockNames;
	private Double numOfShare;
	private Double sharePrice;
	private Double totalSharePrice;

	/**
	 * @param stockname
	 * @param numberOfShars
	 * @param sharePrice
	 */
	public Stock(String stockname, double numberOfShars, double sharePrice) {
		super();
		this.stockNames = stockname;
		this.numOfShare = numberOfShars;
		this.sharePrice = sharePrice;
	}

	// getter setter methods using to get and set the values of variables from the
	// user.
	/**
	 * @return the stockNames
	 */
	public String getStockNames() {
		return stockNames;
	}

	/**
	 * @param stockNames the stockNames to set
	 */
	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	/**
	 * @return the numOfShare
	 */
	public Double getNumOfShare() {
		return numOfShare;
	}

	/**
	 * @param numOfShare the numOfShare to set
	 */
	public void setNumOfShare(Double numOfShare) {
		this.numOfShare = numOfShare;
	}

	/**
	 * @return the sharePrice
	 */
	public Double getSharePrice() {
		return sharePrice;
	}

	/**
	 * @param sharePrice the sharePrice to set
	 */
	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [stockNames=" + stockNames + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
				+ ", totalSharePrice=" + numOfShare * sharePrice + "]";
	}

	/**
	 */
	public Stock() {
		super();
		this.totalSharePrice = totalSharePrice;
	}

}