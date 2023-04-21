/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.guilford.coaldriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author amyme
 */
public class CoalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Coal>YearsCoal = new ArrayList<Coal>();
        int [] CoalHistogram = new int [153];

        // Read applicant information
        //try {
        //    Scanner fileScan = new Scanner(new File("coalEmisions_Past_Future.txt"));
        //    while (fileScan.hasNext()) {
                //  System.out.println(fileScan.next());

       //         int year = fileScan.nextInt();
       //         double coalDemand = fileScan.nextDouble();
       //         Coal everyYrCoal = new Coal(year, coalDemand);
       //        YearsCoal.add(everyYrCoal);
       //     }
       //     System.out.println("The size of the list is " + YearsCoal.size());

       //     fileScan.close();
       // } catch (FileNotFoundException e) {
        //    System.out.println(e);
        //    System.exit(0);
        //}
        
        
        //Making a JFrame & Panel Object
        JFrame appWindow = new JFrame("Years and Coal Demand");
    appWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CoalGraphics coalPanel = new CoalGraphics(YearsCoal);
    appWindow.getContentPane().add(coalPanel);
        
        appWindow.pack();
        appWindow.setVisible(true);

    }
    
}
