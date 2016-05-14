
/**
 * Write a description of class PalindromeChecker here.
 * 
 * @author (z3459597) 
 * @version (Start Date: 20/8/15 ; End Date: 30/8/15)
 */

import java.util.Scanner; 
import java.io.*;
import java.util.*;

public class PalindromeChecker
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        System.out.println ("\"" + input + "\" is ");
        
        String inputLow = input.toLowerCase();
        String[] split = inputLow.split("\\s+");
        String[] splitRev = new String[split.length];
        
        if (revString(inputLow).equals(inputLow) && split.length == 1){             //Check if word is palindrome
            System.out.println("a word palindrome");
        } else {
            System.out.println("not a word palindrome");
        }
        
        splitRev = revArray(split);                         
        if (Arrays.equals(split, splitRev)){                    //CHeck if sentence is a palindrome
            System.out.println("a sentence palindrome");
        } else {
            System.out.println("not a sentence palindrome");
        }
        
        String concatInput = concatArray(split);        
        if (revString(concatInput).equals(concatInput)){        //Check if phrase is a palindrome
            System.out.println("a phrase palindrome");
        } else {
            System.out.println("not a phrase palindrome");
        }
    }
    
    public static String revString(String word){           // Reverse a String
        String wordRev = "";
        for (int i = word.length() - 1; i >= 0; i--){
            wordRev = wordRev + word.charAt(i);
        }
        return wordRev;
    }
    
    public static String[] revArray(String[] sent){         //Reverse an Array
       String[] sentRev = new String[sent.length];
       for (int i = 0; i < sent.length; i++){
           sentRev[i] = sent[sent.length - i - 1];
       }
       return sentRev;
    }
    
    public static String concatArray(String[] sent){        //Concactenate all strings in an array
        String result = "";
        if(sent.length > 0){
            result = sent[0];
            for (int i = 1; i < sent.length; i++){
                result = result + sent[i];
            }
        }
        return result;
    }
}