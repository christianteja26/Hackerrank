/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author ChristianTedja
 */
public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 < v1) {
            if ((x2 - x1) % (v1 - v2) == 0)  
            {
                return "YES";
            }
            else {
                return "NO";
            }
        }
        else  
            return "NO";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
    
}
