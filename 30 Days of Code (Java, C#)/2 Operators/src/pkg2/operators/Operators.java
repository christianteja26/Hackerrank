/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.operators;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author CT
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double tip_cost = meal_cost * (tip_percent / 100.00);
        double tax_cost = meal_cost * (tax_percent / 100.00);
        int total_cost = (int) Math.round(meal_cost + tip_cost + tax_cost);

        System.out.println("The total meal cost is "+total_cost+" dollars.");
    }
    
}
