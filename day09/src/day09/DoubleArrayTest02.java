package day09;

import java.util.Arrays;

public class DoubleArrayTest02 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		// 값을 넣어봅시다.
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 50) + 1;
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("a["+i+"]"+"["+j+"]=" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		//출력2
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}