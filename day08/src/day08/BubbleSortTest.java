package day08;

import java.util.Arrays;

public class BubbleSortTest {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 30) + 1;
		}
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		int temp = 0; // 값을 치환하기 위한 임시 변수
		
		// 버블 정렬을 통해서 오름차순 정렬해보기
		for(int i = (arr.length-1); i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				// 앞뒤를 비교해서 바꾸는 작업
				if(arr[j] < arr[j+1]) {
					// 내 뒤의 위치 값을 잠시 저장
					temp = arr[j+1];
					// 내 위치를 뒤로 이동
					arr[j+1] = arr[j];
					// 내위치에 임시저장한 뒤의 값을 저장
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
	}
}
