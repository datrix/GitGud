
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
        //TODO - Jeff
    }
    
    public static String[] revArray(String[] sent){         //Reverse an Array
       //TODO - Jeff
    }
    
    public static String concatArray(String[] sent){        //Concactenate all strings in an array
        //TODO - Rach
    }
}