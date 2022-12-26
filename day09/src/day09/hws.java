package day09;

public class hws {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		int[] rowSum = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("rowSum =" + rowSum[i] +" ");
		}
	}
}
