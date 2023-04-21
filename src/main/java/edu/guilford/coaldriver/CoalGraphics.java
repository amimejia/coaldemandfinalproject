/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.guilford.coaldriver;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;

/**
 *
 * @author amyme
 */
public class CoalGraphics extends JPanel {

    private ArrayList<Coal> YearsCoal;
    private double startX = 100.0;
    private double endX = 900.0;
    private double year1 = 1800.0;
    private double year2 = 2100.0;
    private double startY = 100.0;
    private double endY = 700.0;
    private double coal1 = 0.0;
    private double coal2 = 50000.0;
    private double year;
    private double coalDemand;
    
    

    //COnstructor
    public CoalGraphics(ArrayList<Coal> YearsCoal) {
        this.YearsCoal = YearsCoal;
        setPreferredSize(new Dimension(1000, 800));
    }
// Getters & Setters

    public ArrayList<Coal> getYearsCoal() {
        return YearsCoal;
    }

    public void setYearsCoal(ArrayList<Coal> YearsCoal) {
        this.YearsCoal = YearsCoal;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2 = (Graphics2D) g;
        //g2 is a graphics objects
        //Check out Loop in Lab 10
        try {
            Scanner fileScan = null;
            try {
                fileScan = new Scanner(new File(CoalDriver.class.getResource("/coalEmisions_Past_Future.txt").toURI()));
            } catch (URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            while (fileScan.hasNext()) {
                //  System.out.println(fileScan.next());

                int year = fileScan.nextInt();
                double coalDemand = fileScan.nextDouble();
                Coal everyYrCoal = new Coal(year, coalDemand);
                YearsCoal.add(everyYrCoal);
                int x = (int) plottingXPts(year);
                int y = (int) plottingYPts(coalDemand);
                g2.setColor(Color.blue);
                g2.drawLine(x - 3, y - 3, x + 3, y + 3);
                g2.drawLine(x - 3, y + 3, x + 3, y - 3);
            }
            //System.out.println("The size of the list is " + YearsCoal.size());

            fileScan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }

        //Drawing x & y axis
        g2.setColor(Color.black);
        g2.draw(new Line2D.Double(95, 20, 95, 600));
        g2.draw(new Line2D.Double(95, 600, 900, 600));

        //I think I could write a loop here but I'm not sure how to with
        //two x & y values as a line
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(new Line2D.Double(150, 20, 150, 600));
        g2.draw(new Line2D.Double(200, 20, 200, 600));
        g2.draw(new Line2D.Double(250, 20, 250, 600));
        g2.draw(new Line2D.Double(300, 20, 300, 600));
        g2.draw(new Line2D.Double(350, 20, 350, 600));
        g2.draw(new Line2D.Double(400, 20, 400, 600));
        g2.draw(new Line2D.Double(450, 20, 450, 600));
        g2.draw(new Line2D.Double(500, 20, 500, 600));
        g2.draw(new Line2D.Double(550, 20, 550, 600));
        g2.draw(new Line2D.Double(600, 20, 600, 600));
        g2.draw(new Line2D.Double(650, 20, 650, 600));
        g2.draw(new Line2D.Double(700, 20, 700, 600));
        g2.draw(new Line2D.Double(750, 20, 750, 600));
        g2.draw(new Line2D.Double(800, 20, 800, 600));
        g2.draw(new Line2D.Double(850, 20, 850, 600));
        g2.draw(new Line2D.Double(900, 20, 900, 600));

        g2.draw(new Line2D.Double(900, 100, 95, 100));
        g2.draw(new Line2D.Double(900, 200, 95, 200));
        g2.draw(new Line2D.Double(900, 300, 95, 300));
        g2.draw(new Line2D.Double(900, 400, 95, 400));
        g2.draw(new Line2D.Double(900, 500, 95, 500));
        
        //g2.draw(new Line2D.Double(900, 600, 95, 600));
        //g2.draw(new Line2D.Double(900, 700, 95, 700));
        //g2.draw(new Line2D.Double(900, 800, 95, 800));

        //Drawing Labels
        g2.setColor(Color.BLACK);
        Font titleFont = new Font("Verdana", Font.BOLD, 15);
        g2.setFont(titleFont);
        g2.drawString("Years and Coal Demand from 1800 - 2100", 900, 50);
        g2.drawString("Future Predictions", 900, 70);
        
        Font thisFont = new Font("Verdana", Font.BOLD, 11);
        g2.setFont(thisFont);

        g2.setColor(Color.black);
        g2.drawString("Coal Demand", 8, 8);
        g2.drawString("Years 1800 - 2100", 500, 630);
        g2.drawString("TWh", 11, 20);
        g2.drawString("Data aquired from OurWorldinData.org", 900, 100);
        
        Font smallerFont = new Font("Verdana", Font.BOLD, 9);
        g2.setFont(smallerFont);
        g2.drawString("1800", 90, 610);
        g2.drawString("1818", 145, 610);
        g2.drawString("1836", 200, 610);
        g2.drawString("1854", 250, 610);
        g2.drawString("1872", 300, 610);
        g2.drawString("1890", 350, 610);
        g2.drawString("1908", 400, 610);
        g2.drawString("1926", 450, 610);
        g2.drawString("1944", 500, 610);
        g2.drawString("1962", 550, 610);
        g2.drawString("1980", 600, 610);
        g2.drawString("1998", 650, 610);
        g2.drawString("2016", 700, 610);
        g2.drawString("2034", 750, 610);
        g2.drawString("2052", 800, 610);
        g2.drawString("2070", 850, 610);
        g2.drawString("2100", 900, 610);
       
        g2.drawString("8,300", 60, 500);
        g2.drawString("17,000", 60, 400);
        g2.drawString("19,300", 60, 300);
        g2.drawString("25,000", 60, 200);
        g2.drawString("33,300", 60, 100);
        g2.drawString("41,600", 60, 20);







        //int x = (int)plottingXPts(year);
        //int y = (int)plottingYPts(coalDemand);
        //System.out.println(x);
        //System.out.println(y);
    }

    //Plotting Helper Method
    //
    public double plottingXPts(double year) {
        double ptPlottedX = ((startX - endX) / (year1 - year2)) * (year - year1) + startX;
        return ptPlottedX;
    }

    public double plottingYPts(double coalDemand) {
        double ptPlottedY = ((startY - endY) / (coal1 - coal2)) * (coalDemand - coal1) + startY;
        return 700 - ptPlottedY;
    }

}
