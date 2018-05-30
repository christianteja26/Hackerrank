/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.binary.numbers;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author ChristianTedja
 */
public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = "";
        while(n > 0)
        {
            binary += (n % 2);
            n /= 2;
        }
        binary = new StringBuilder(binary).reverse().toString();
        int max = 0;
        int curr = 0;
        for(char c : binary.toCharArray())
        {
            if(c == '1') curr++;
            else curr = 0;
            
            max = Math.max(max, curr);
        }
        System.out.println(max);
        
        scanner.close();
    }
    
}
