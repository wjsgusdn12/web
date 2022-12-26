package day08;

public class Exam01 {
	public static void main(String[] args) {
		
		// 이등변 삼각형 만들기
		// 제한 조건은 이중 루프만 가능
		// 나머지는 없음
		
		// 공백 + 별 -> j의 반복 횟수
		// 공백 + 별은 루프가 돌수록 1개씩 증가 한다. 5, 6, 7 -> j의 반복 횟수 증가
		// 별은 하나씩 빠르게 시작 한다, 공백이 줄어듬
		// j가 돌면서 별의 시작 위치만 제어 하면 된다!
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9+i; j++) {
				if(j < 8-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}
}
