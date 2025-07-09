package com.leetcodeadrian;

import java.util.Arrays;
import java.util.HashMap;

public class Palindrome {

	public static void main(String[] args) {
			
		// Given an integer x, return true if x is a palindrome, and false otherwise.
		// x = 121 = true
		// x = -121 = false (because reversed is 121-)
		// x = 10 = false
		// Bonus: Solve w/o converting to string
		
	}
	
    
	// Java cheat way
    private static boolean isPalindrome(int x) {
    	if (x < 0) {
    		return false;
    	}
        
    	String value = String.valueOf(x);
    	String reversed = new StringBuilder(value).reverse().toString();
    	return value.equals(reversed); 
    }
    
    // doing it with character array
    private static boolean isPalindromeSimple(int x) {
    	
    	if (x < 0) { 
    		return false;
    	}
    	
    	
    	
    	return true;
    }
    
    private static boolean isPalindromeNoConvert(int x) {
    	return true;
    }


}
