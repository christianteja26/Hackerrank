/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.intro.to.conditional.statements;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author CT
 */
public class IntroToConditionalStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
        if (n > 5 && n < 21) {
            ans = "Weird";
        }
        else
            ans = "Not Weird";
      }
      System.out.println(ans);
    }
    
}
