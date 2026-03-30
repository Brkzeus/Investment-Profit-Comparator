/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;

import java.util.ArrayList;

public class ForeignCurrencyInvestment extends Investment {
    private String currencySymbol;
    private double exchangeRateBuy;
    private ArrayList<Double> sellingHistory;

    public ForeignCurrencyInvestment(double taxRate,String currencySymbol, double exchangeRateBuy,ArrayList<Double> sellingHistory) {
        super( taxRate);
        this.currencySymbol = currencySymbol;
        this.exchangeRateBuy = exchangeRateBuy;
        this.sellingHistory = sellingHistory;
    }

    public double getExchangeRateBuy() {
        return exchangeRateBuy;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public ArrayList<Double> getSellingHistory() {
        return sellingHistory;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setExchangeRateBuy(double exchangeRateBuy) {
        this.exchangeRateBuy = exchangeRateBuy;
    }

    public void setSellingHistory(ArrayList<Double> sellingHistory) {
        this.sellingHistory = sellingHistory;
    }
    
    
    
    
    @Override
    public double calculateIncome(double spent) {
       double boughtCurrency=(spent/exchangeRateBuy);
       if(boughtCurrency <=0){
            return spent;
        }
        return boughtCurrency*predictedIncreasedPrice();
    }
    
    public double predictedIncreasedPrice(){
        
        if(sellingHistory.size()<2){
            return sellingHistory.get(sellingHistory.size()-1);
        }
        
        double increaseRateSum=0;
        int increaseWeightTotal=0;
        for (int i = 1; i < sellingHistory.size(); i++) {
            int increaseWeight=i;
            increaseRateSum+=(sellingHistory.get(i)-sellingHistory.get(i-1))/sellingHistory.get(i-1)*(increaseWeight);
            increaseWeightTotal+=increaseWeight;
        }
        return sellingHistory.get(sellingHistory.size()-1)*(1+(increaseRateSum/increaseWeightTotal));

    }
    
    
    
    
}
