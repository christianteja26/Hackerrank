/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.arrays;
import java.io.*;
import java.util.*;
/**
 *
 * @author ChristianTedja
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        String output = "";
        for (int i = n-1; i >= 0; i--) {
            output += arr[i] + " ";
        }
        System.out.println(output);
    }
    
}
