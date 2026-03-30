/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;

import java.util.ArrayList;



public class InvestmentLedger {
    
    private ArrayList<StockInvestment> StockInvestmentScenario;
    private ArrayList<ForeignCurrencyInvestment> ForeignCurrencyInvestmentScenario;
    private ArrayList<TermDepositInvestment> TermInvestmentScenario;
    
    private InvestmentSimulation[] topScenarios;
    private int scenarioCount;

    public InvestmentLedger() {
        this.StockInvestmentScenario = new ArrayList<>();
        this.ForeignCurrencyInvestmentScenario = new ArrayList<>();
        this.TermInvestmentScenario=new ArrayList<>();
        this.topScenarios=new InvestmentSimulation[3];
        this.scenarioCount = 0;
    }

    public ArrayList<StockInvestment> getStockInvestmentScenario() {
        return StockInvestmentScenario;
    }

    public ArrayList<ForeignCurrencyInvestment> getForeignCurrencyInvestmentScenario() {
        return ForeignCurrencyInvestmentScenario;
    }

    public ArrayList<TermDepositInvestment> getTermInvestmentScenario() {
        return TermInvestmentScenario;
    }
    
    public InvestmentSimulation[] getTopScenarios() {
    return this.topScenarios; 
}
    
    
    public boolean isProfitable(Investment investment){
        if(investment instanceof StockInvestment){
            return investment.calculateProfit(((StockInvestment) investment).getBuyPricePerStock())>0;
        }
        else if(investment instanceof ForeignCurrencyInvestment){
            return investment.calculateProfit(((ForeignCurrencyInvestment) investment).getExchangeRateBuy())>0;
        }
        else if (investment instanceof TermDepositInvestment){
            return true;
        }
        return false;
    }
    
    public void addStock(StockInvestment stock) {
        StockInvestmentScenario.add(stock);
    }

    public void addCurrency(ForeignCurrencyInvestment currency) {
        ForeignCurrencyInvestmentScenario.add(currency);
    }
    
    public void addTermDeposit(TermDepositInvestment termDeposit) {
        TermInvestmentScenario.add(termDeposit);
    }
    
    public void evaluateInvestments( double capital){
        
        resetScenarios();
        
        for (StockInvestment stockInvestment : StockInvestmentScenario) {
            if(stockInvestment.calculateProfit(capital)<=0 && !isProfitable(stockInvestment))
                continue;
            manageScenario(new InvestmentSimulation(stockInvestment,null,null,capital,0,0,stockInvestment.calculateProfit(capital)));
        }
        for (ForeignCurrencyInvestment foreignCurrencyInvestment : ForeignCurrencyInvestmentScenario) {
            if(foreignCurrencyInvestment.calculateProfit(capital)<=0 && !isProfitable(foreignCurrencyInvestment))
                continue;
            manageScenario(new InvestmentSimulation(null,null,foreignCurrencyInvestment,0,0,capital,foreignCurrencyInvestment.calculateProfit(capital)));
        }
        for (TermDepositInvestment termDepositInvestment : TermInvestmentScenario) {
            if(termDepositInvestment.calculateProfit(capital)<=0 && !isProfitable(termDepositInvestment))
                continue;
            manageScenario(new InvestmentSimulation(null,termDepositInvestment,null,0,capital,0,termDepositInvestment.calculateProfit(capital)));
        }
    }
    
    public void manageScenario(InvestmentSimulation scenario){
        
        
        if(scenarioCount<3){
            topScenarios[scenarioCount++]=scenario;
            return;
        }
        
        int lastPlace = 0;
        for (int i = 1; i < 3; i++) {
            if (topScenarios[i].getTotalProfit() < topScenarios[lastPlace].getTotalProfit()) {
                lastPlace = i;
            }
        }

        if (scenario.getTotalProfit() > topScenarios[lastPlace].getTotalProfit()) {
            topScenarios[lastPlace] = scenario;
        }
   
    }
    
    private void resetScenarios() {
        scenarioCount = 0;
        for (int i = 0; i < 3; i++) {
            topScenarios[i] = null;
        }
    }

    public void clearEverything() {
    StockInvestmentScenario.clear();
    ForeignCurrencyInvestmentScenario.clear();
    TermInvestmentScenario.clear();
    topScenarios = new InvestmentSimulation[3];
}
    
    

    
    
    
    
    
}
