package day09;

public class DoubleArrayTest03 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		// 각 행의 합을 구해봅시다.
		int[] rowSum = new int[5];
		
		// 값을 넣어봅시다
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 50) + 1;
			}
		}
		
		// 행간의 합을 구하자
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				rowSum[i] += arr[i][j]; // 각행이 지닌 값을 합한다
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("rowSum =" + rowSum[i] +" ");
		}
	}
}

