/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.lets.review;
import java.io.*;
import java.util.*;
/**
 *
 * @author ChristianTedja
 */
public class LetsReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        
        scanner.close();
        
        for (int i = 0; i < n; i++) {
            String[] toArray = words[i].split("");
            String outputOdd = "", outputEven = "";
            
            for (int j = 0; j < toArray.length; j++) {
                if (j % 2 == 0) {
                    outputEven += toArray[j];
                }else{
                    outputOdd += toArray[j];
                }
            }
            
            System.out.println(outputEven + " " + outputOdd);
        }
    }
    
}
