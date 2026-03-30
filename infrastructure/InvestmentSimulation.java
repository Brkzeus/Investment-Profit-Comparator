/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;


public class InvestmentSimulation {
    
    private StockInvestment stock;
    private TermDepositInvestment termDeposit;
    private ForeignCurrencyInvestment foreignCurrency;
    
    private double stockInvested;
    private double termDepositInvested;
    private double foreignCurrencyInvested;
    
    private double totalProfit;

    public InvestmentSimulation(StockInvestment stock, TermDepositInvestment termDeposit, ForeignCurrencyInvestment foreignCurrency, double stockInvested, double termDepositInvested, double foreignCurrencyInvested, double totalProfit) {
        this.stock = stock;
        this.termDeposit = termDeposit;
        this.foreignCurrency = foreignCurrency;
        this.stockInvested = stockInvested;
        this.termDepositInvested = termDepositInvested;
        this.foreignCurrencyInvested = foreignCurrencyInvested;
        this.totalProfit = totalProfit;
    }

    public StockInvestment getStock() {
        return stock;
    }

    public TermDepositInvestment getTermDeposit() {
        return termDeposit;
    }

    public ForeignCurrencyInvestment getForeignCurrency() {
        return foreignCurrency;
    }

    public double getStockInvested() {
        return stockInvested;
    }

    public double getTermDepositInvested(){
        return termDepositInvested;
    }

    public double getForeignCurrencyInvested(){
        return foreignCurrencyInvested;
    }

    public double getTotalProfit(){
        return totalProfit;
    }
    
    public double getStockProfit(){
    if (stock == null) return 0;
    return stock.calculateIncome(stockInvested) - stockInvested;
}

    public double getCurrencyProfit(){
    if (foreignCurrency == null) return 0;
    return foreignCurrency.calculateIncome(foreignCurrencyInvested) - foreignCurrencyInvested;
    }

    public double getDepositProfit(){
    if (termDeposit == null) return 0;
    return termDeposit.calculateIncome(termDepositInvested) - termDepositInvested;
    }
    
    
    
    public String writtenReport(){
        String report = "--- PORTFOLIO ANALYSIS ---\n";
    
    
    if(stock != null){
        report += String.format("Stock: %s | Invested: $%.2f\n", 
                  stock.getStockName(), stockInvested);
    }
    
    if(foreignCurrency != null){
        report += String.format("Currency: %s | Invested: $%.2f\n", 
                  foreignCurrency.getCurrencySymbol(), foreignCurrencyInvested);
    }
    
    if(termDeposit != null){
        report += String.format("Deposit: %s | Invested: $%.2f\n", 
                  termDeposit.getTermInvestmentName(), termDepositInvested);
    }
    
    
    report += "--------------------------\n";
    report += String.format("TOTAL PREDICTED PROFIT: $%.2f\n", totalProfit);
    
    return report;
    }
  
}
