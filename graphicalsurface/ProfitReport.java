/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicalsurface;

import infrastructure.InvestmentSimulation;
import java.util.Date;


public class ProfitReport {
    public static String generateReport(double capital, InvestmentSimulation[] scenarios) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("============================================================\n");
        sb.append("                PROFIT ANALYSIS DASHBOARD             \n");
        sb.append("============================================================\n");
        sb.append(String.format(" INITIAL CAPITAL: TL%,.2f\n", capital));
        sb.append(String.format(" ANALYSIS DATE:   %s\n", new Date().toString()));
        sb.append("============================================================\n\n");

        for (int i = 0; i < scenarios.length; i++) {
            if (scenarios[i] != null) {
                sb.append(" RANK #").append(i + 1).append(" INVESTMENT STRATEGY\n");
                sb.append(buildReportTable(scenarios[i]));
                sb.append("\n");
            }
        }
        sb.append("============================================================\n");
        sb.append("               SIMULATION RESULTS COMPLETE                  \n");
        sb.append("============================================================\n");

        return sb.toString();
    }

    private static String buildReportTable(InvestmentSimulation sim) {
        
        String border = "+------------+---------------------------+--------------+\n";
        StringBuilder table = new StringBuilder();

        table.append(border);
        table.append(String.format("| %-10s | %-25s | %-12s |\n", "TYPE", "INVESTMENT NAME", "PROFIT"));
        table.append(border);

       
        if (sim.getStock() != null) {
            table.append(String.format("| %-10s | %-25s | TL%,11.2f |\n", 
                "STOCK", truncate(sim.getStock().getStockName()), sim.getStockProfit()));
        }
        
        
        if (sim.getForeignCurrency() != null) {
            table.append(String.format("| %-10s | %-25s | TL%,11.2f |\n", 
                "CURRENCY", truncate(sim.getForeignCurrency().getCurrencySymbol()), sim.getCurrencyProfit()));
        }
        
       
        if (sim.getTermDeposit() != null) {
            table.append(String.format("| %-10s | %-25s | TL%,11.2f |\n", 
                "DEPOSIT", truncate(sim.getTermDeposit().getTermInvestmentName()), sim.getDepositProfit()));
        }

        table.append(border);
        
       

        return table.toString();
    }

    
    private static String truncate(String text) {
        if (text == null) return "-";
        return text.length() > 25 ? text.substring(0, 22) + "..." : text;
    }
}
