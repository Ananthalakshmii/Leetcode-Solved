package com.accolite.easy;
/*
 https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 
 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		int overallProfit=0;
		int profitIfSoldToday=0;
		int leastSoFar=Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<leastSoFar) {
				leastSoFar=prices[i];
			}
			profitIfSoldToday=prices[i]-leastSoFar;
			if(overallProfit<profitIfSoldToday)
				overallProfit=profitIfSoldToday;
		}
		
        
		
		return overallProfit;
    }

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int profit=maxProfit(prices);
		System.out.println("maximum profit "+profit);

	}

}
