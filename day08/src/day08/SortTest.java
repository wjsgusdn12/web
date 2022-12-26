package day08;

import java.util.Arrays;
import java.util.Collections;

public class SortTest {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		// Arrays 클래스르 이용한 정렬
		// 1 오름차순
		Arrays.sort(arr);
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		//2. 내림차순 되지만 현재 진도로는 조금 어려움.
		
	}
}
