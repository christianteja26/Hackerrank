/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.dictionaries.and.maps;
import java.util.*;
import java.io.*;
/**
 *
 * @author ChristianTedja
 */
public class DictionariesAndMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> contact = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contact.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (contact.get(s) != null) {
                System.out.println(s + "=" +contact.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
    
}
