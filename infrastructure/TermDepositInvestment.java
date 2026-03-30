/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;

public class TermDepositInvestment extends Investment {
    
    private String termInvestmentName;
    private double requiredAmount;
    private double interestRate;

    public String getTermInvestmentName() {
        return termInvestmentName;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    
   

    public TermDepositInvestment(double requiredAmount, double interestRate,double taxRate,String termInvestmentName) {
    
        super(taxRate);
        this.termInvestmentName=termInvestmentName;
        this.requiredAmount = requiredAmount;
        this.interestRate = interestRate;
     
    }

    @Override
    public double calculateIncome(double spent) {
        
        if(spent<requiredAmount){
            return spent;
        }
        
        return requiredAmount*(1+interestRate);
    }
    
}
