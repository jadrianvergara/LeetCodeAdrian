package com.leetcodeadrian;

public class Palindrome {

	public static void main(String[] args) {
			
		// Given an integer x, return true if x is a palindrome, and false otherwise.
		// x = 121 = true
		// x = -121 = false (because reversed is 121-)
		// x = 10 = false
		// Bonus: Solve w/o converting to string

        Boolean solution = Palindrome.isPalindrome(121);
        System.out.println(Boolean.toString(solution));
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
        // moving left and right pointers inwards
        char[] numAsArray = String.valueOf(x).toCharArray();
        int left = 0;
        int right = numAsArray.length - 1;
        while (left < right) {
            if (numAsArray[left] != numAsArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // best solution
    private static boolean isPalindromeNoConvert(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }


}
