package com.ojas.junit;

public class AssertClass {
	
	// Add two numbers 
	public int add(int a, int b) {
		return a + b;
	}
	
	// check perfect
	static boolean checkPerfectNum(int number) {
		int sum = 0, temp = number, rem = 0;
		boolean b = false;
		while( number != 0 ) {
			int fact = 1;
			rem = number % 10 ;
			while(rem != 0) {
				fact = fact * rem;
				rem--;
			}
			sum = sum + fact;
			number = number / 10;
		}
		if (temp == sum) {
			b = true;
		}
		return b;
	}
	
	public int[] sorting(int[] arr) {
		
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j -1;
			}
			arr[j] = temp;
					
		}
				
		return arr;
		
	}
}
