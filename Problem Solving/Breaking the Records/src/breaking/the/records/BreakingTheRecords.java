/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breaking.the.records;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author ChristianTedja
 */
public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        int highScore = Integer.MIN_VALUE;
        int lowScore = Integer.MAX_VALUE;
        int numbersOfHigh = 0;
        int numbersOfLow = 0;

        for (int i = 0; i < score.length; i++) {
            if (score[i] > highScore) {
                highScore = score[i];
                numbersOfHigh++;
            }
            if (score[i] < lowScore) {
                lowScore = score[i];
                numbersOfLow++;
            }
        }

        int[] space = {numbersOfHigh-1, numbersOfLow-1};

        return space;
    }
    
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.print(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                System.out.print(" ");
            }
        }
    }
    
}
