/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthday.chocolate;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author ChristianTedja
 */
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){
        int ways = 0;
        int total = 0;
        
        for (int i = 0; i < m; i++) {
            total += s[i];
        }
        if (total == d) {
            ways++;
        }
        
        for (int i = 0; i < s.length-m; i++) {
            total = total - s[i] + s[i+m];
            if (total == d) {
                ways++;
            }
        }
        
        return ways;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
    
}
