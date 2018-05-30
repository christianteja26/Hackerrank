/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg2d.arrays;
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
public class Arrays {

    static int sum(int[][] arr){
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int mid = arr[i+1][j+1];
                int low = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (top + mid + low > maxSum) {
                    maxSum = (top + mid + low);
                }
            }
        }
        
        return maxSum;
    }
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        System.out.println(sum(arr));

        scanner.close();
    }
    
}
