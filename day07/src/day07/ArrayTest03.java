package day07;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		//우선 배열에다가 랜덤함수를 이용헤서 값을 넣는다
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) +1;
		}
		
		// 배열이 지닌 값중에서 짝수만 골라서 더해봅시다
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		//Arrays 를 이용하여 배열 값 출력
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 합 : " + sum);
		
	}
}
