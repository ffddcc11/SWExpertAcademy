package week1;

import java.util.*;

public class Q2072 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[][] testCase = new int[t][10];
		int[] result = new int[t];
		
		for(int i=0; i<t; i++) {
			int temp = 0;
			
			for(int j=0; j<10; j++) {
				testCase[i][j] = sc.nextInt();
				
				if(testCase[i][j] % 2 == 1) {
					temp += testCase[i][j];
				}
			}
			
			result[i] = temp;
		}
		
		for(int i=1; i<=t; i++) {
			System.out.println("#" + i + " " + result[i-1]);
		}
	}
}
