/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicalsurface;

import infrastructure.InvestmentSimulation;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 * StatisticalGraph - Renders a Bar Chart for the Top 3 Investment Portfolios.
 */
public class StatisticalGraph extends JPanel {

    private InvestmentSimulation[] scenarios;

    public StatisticalGraph() {
        this.setBackground(Color.WHITE);
    }

    
    public void setData(InvestmentSimulation[] scenarios) {
        this.scenarios = scenarios;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        
        if (scenarios == null || scenarios.length == 0 || scenarios[0] == null) {
            g2.setColor(Color.LIGHT_GRAY);
            g2.setFont(new Font("SansSerif", Font.ITALIC, 14));
            g2.drawString("No calculation data available. Please click Calculate.", 20, 40);
            return;
        }

       
        int width = getWidth();
        int height = getHeight();
        int paddingBottom = 100; 
        int paddingTop = 50;
        int paddingSide = 60;
        
        int barWidth = (width - (paddingSide * 2)) / 3 - 40;

       
        double maxProfit = 0;
        for (InvestmentSimulation sim : scenarios) {
            if (sim != null && sim.getTotalProfit() > maxProfit) {
                maxProfit = sim.getTotalProfit();
            }
        }
        if (maxProfit <= 0) maxProfit = 1; // Prevent math errors

        
        g2.setColor(Color.DARK_GRAY);
        g2.drawLine(paddingSide, height - paddingBottom, width - paddingSide, height - paddingBottom); // X
        g2.drawLine(paddingSide, paddingTop, paddingSide, height - paddingBottom); // Y

        
        for (int i = 0; i < 3; i++) {
            if (scenarios[i] == null) continue;

            double profit = scenarios[i].getTotalProfit();
            
            int barHeight = (int) ((profit / maxProfit) * (height - paddingBottom - paddingTop));
            int x = paddingSide + 25 + i * (barWidth + 40);
            int y = height - paddingBottom - barHeight;

            
            if (i == 0) g2.setColor(new Color(46, 204, 113));      
            else if (i == 1) g2.setColor(new Color(52, 152, 219)); 
            else g2.setColor(new Color(149, 165, 166));            

            
            g2.fillRect(x, y, barWidth, barHeight);
            g2.setColor(Color.BLACK);
            g2.drawRect(x, y, barWidth, barHeight);

            
            g2.setFont(new Font("SansSerif", Font.BOLD, 12));
            g2.drawString("Rank " + (i + 1), x + (barWidth / 4), height - paddingBottom + 20);
            g2.drawString(String.format("$%.2f", profit), x, y - 10);

            
            g2.setFont(new Font("SansSerif", Font.PLAIN, 10));
            int textY = height - paddingBottom + 38;

            
            if (scenarios[i].getStock() != null) {
                g2.drawString("Stock: " + scenarios[i].getStock().getStockName(), x, textY);
            }
            
            if (scenarios[i].getForeignCurrency() != null) {
                g2.drawString("Curr: " + scenarios[i].getForeignCurrency().getCurrencySymbol(), x, textY + 14);
            }
            
            if (scenarios[i].getTermDeposit() != null) {
                g2.drawString("Dep: " + scenarios[i].getTermDeposit().getTermInvestmentName(), x, textY + 28);
            }
        }
        
       
        g2.setFont(new Font("SansSerif", Font.BOLD, 10));
        g2.drawString("Portfolio Comparison", width / 2 - 50, height - 10);
    }
}
