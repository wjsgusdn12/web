package day06;

public class DoubleLoopTest02 {
	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			// 별이 다 찍힌 다음에 줄바꿈
			System.out.println();
		}
	}
}
