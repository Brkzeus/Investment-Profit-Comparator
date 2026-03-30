/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infrastructure;


public abstract class Investment {
    
    protected double taxRate;

    public Investment(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    public double calculateProfit(double spent){
        return (calculateIncome(spent)-spent)*(1-taxRate);
    }
    public abstract double calculateIncome(double spent);
    
            
}
