package day07;

import java.util.Arrays;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 배열에 값을 넣어봅시다.
		// 변수[index] = 값
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// 반복문을 이영하여 배열에 값을 넣어봅시다
		for(int i = 0; i < arr.length; i++) {
			// 배열에 데이터 넣기
			arr[i] = (i+1) * 2;
		}
		
		// 출력해봅시다 arr[index]
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		/** 
		 * Arrays 클래스는 배욜을 도와주는 유틸 클랴스입니다.
		 * 배열을 위한 여러 기능을 가지고 있습니다.
		 * 1차 배열만 가능.
		 */
		System.out.println(Arrays.toString(arr));
		
	}
}
