package com.leetcodeadrian;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
			
	// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

	// You may assume that each input would have exactly one solution, and you may not use the same element twice.

	// You can return the answer in any order.
		
		// nums = [2,7,11,15], target = 9 ; [0,1]
		// nums = [3,2,4], target = 6 ; [1,2]
		// nums = [3,3], target = 6 ; [0,1]
		
		int[] nums1 = new int[] {2,7,11,15};
		int target1  = 9;
		
		int[] nums2 = new int[] {3,2,4};
		int target2  = 6;
		
		int[] nums3 = new int[] {3,3};
		int target3  = 6;
			
		int[] okaySolution = TwoSum.twoSumBruteForce(nums1,target1);
		System.out.println(Arrays.toString(okaySolution));
		
		int[] betterSolution = TwoSum.twoSum(nums1, target1);
		System.out.println(Arrays.toString(betterSolution));
	}
	
    private static int[] twoSumBruteForce(int[] nums, int target) {
    	
    	// For each element, check all others starting from the next element
    	// If found pair for result, return answer, otherwise move on to the next element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // Nested for = O(n^2) = not the best
    	

        return new int[0]; // if no solution, even though it says each has exactly 1 solution
    }
    
    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Understand that hashmap lookups are quick

        // For each element, find its complement in the map
        // If not there (such is nums[0]), add it to map then proceed
        // Eventually, assuming one solution per set, the loop will come upon the complement
        // and that is when the result is returned.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[0];
    }

}
