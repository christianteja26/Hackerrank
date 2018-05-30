/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.recursion;
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
public class Recursion {

    static int factorial(int n) {
        int result = 1;
        if (n > 1) {
            return result = n*factorial(n-1);
        }
        else
            return result;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);
        
        System.out.println(String.valueOf(result));

        scanner.close();
    }
    
}
