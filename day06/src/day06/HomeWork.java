package day06;

// 3 for문으로 만들었던 이등변 삼각형을 2 for문과 if문으로 출력해보기

public class HomeWork {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			
			for(int k=9-i; k>0; k--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			// 별이 다 찍힌 다음에 줄바꿈
			System.out.println();
		}
	}
}
