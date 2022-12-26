package day06;

public class DoubleLoopTest03 {
	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			
			for(int k=7-i; k>0; k--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			// 별이 다 찍힌 다음에 줄바꿈
			System.out.println();
		}
	}
}
