/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;

import java.util.ArrayList;

public class StockInvestment extends Investment {
    
    private String stockName;
    private double buyPricePerStock;
    private ArrayList<Double> sellPriceHistory;

    public double getBuyPricePerStock() {
        return buyPricePerStock;
    }

    public String getStockName() {
        return stockName;
    }

    public ArrayList<Double> getSellPriceHistory() {
        return sellPriceHistory;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setBuyPricePerStock(double buyPricePerStock) {
        this.buyPricePerStock = buyPricePerStock;
    }

    public void setSellPriceHistory(ArrayList<Double> sellPriceHistory) {
        this.sellPriceHistory = sellPriceHistory;
    }
    

    public StockInvestment(double taxRate,String stockName, double buyPricePerStock, ArrayList<Double> sellPriceHistory) {
        super(taxRate);
        this.stockName = stockName;
        this.buyPricePerStock= buyPricePerStock;
        this.sellPriceHistory = sellPriceHistory;
    }
    
    
    @Override
    public double calculateIncome(double spent) {
        
        int boughtUnits=(int) (spent/buyPricePerStock);
        
        if(boughtUnits <=0){
            return spent;
        }
        return boughtUnits*predictedIncreasedPrice();
        
        
        
    }
    public double predictedIncreasedPrice(){
        double increaseRateSum=0;
        double increaseRateWeightTotal=0;

        if(sellPriceHistory.size()<2){
            return sellPriceHistory.get(sellPriceHistory.size()-1);
        }
        
        for (int i = 1; i < sellPriceHistory.size(); i++) {
            
            int increaseRateWeight=i;
            increaseRateSum+=((sellPriceHistory.get(i)-sellPriceHistory.get(i-1))/sellPriceHistory.get(i-1))*(increaseRateWeight);
            increaseRateWeightTotal+=i;
            
        }
        
        return (sellPriceHistory.get(sellPriceHistory.size()-1))*(1+(increaseRateSum/increaseRateWeightTotal));
    }
    
    
    
    
    
}
