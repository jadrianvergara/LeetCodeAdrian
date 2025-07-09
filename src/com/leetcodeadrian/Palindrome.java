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
    	
    	// type conversions
    	String stringVal = String.valueOf(x);
    	char[] numAsArray = stringVal.toCharArray();
    	
    	// even
    	if (numAsArray.length % 2 == 0) {
    		int endpoint = (numAsArray.length / 2) - 1;
    		// have one array that goes to that point
    		
    	}
    	
    	// odd
    	if (numAsArray.length % 2 == 1) {
    		int endpoint = (numAsArray.length -1 ) / 2;
    		// this needs to be in both arrays compared, the last value in array 1, first value in array 2
    		
    	}
    	
    	
    	
    	return true;
    }
    
    private static boolean isPalindromeNoConvert(int x) {
    	return true;
    }


}
