package day08;

public class Exam02 {
	public static void main(String[] args) {
		
		// 숫자들을 변수에 저장해서 사용해보자
		int line = 9; // 전체 라인
		int middle = 9/2; // 중앙
		int spaceCnt = 0; // 공백칸수
		int loopCnt = 0; // j 반복 횟수
		
		// 루프 진행
		for(int i = 0; i < line; i++) {
			// 중앙 전 과 후는 다르다
			// 중앙 전 별+, 공백-
			if(middle >= i) {
				loopCnt = 9+i;
				spaceCnt = line - i - 1;
			}else {
				// 중앙을 지나면 공백+1, 반복-1
				loopCnt--;
				spaceCnt++;
			}
			
			for(int j = 0; j < loopCnt; j++) {
				if(j < spaceCnt) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
