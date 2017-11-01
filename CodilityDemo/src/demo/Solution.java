package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Solution {

	public int solution(int[] A) {
		// write your code in Java SE 8
		//Find the highest positive integer in A, check if one below it occurs, else find the next ...sort array first.

		Arrays.sort(A);

		System.out.println("The sorted int array is:");
		for (int number : A) {
			System.out.println("Number = " + number);
		}		
		int max = A[A.length - 1];	
		if(max <= 0){
			return 1;
		}else {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < A.length; i++) {
				list.add(A[i]);
			}		
			for (int i = 1; i < max; i++) {
				if(!list.contains(i)){
					return i;
				}
			}
			
			return max + 1;
		}
			}



	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] A = {-1,-3 , 1, 2 };
		System.out.println(sol.solution(A));
	}
}
