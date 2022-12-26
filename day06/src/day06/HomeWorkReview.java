package day06;

import java.util.Scanner;

public class HomeWorkReview {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용해서 특정 값을 받는다. (1~100)
		 * 
		 * 2. 랜덤함수를 이용해서 특정 값을추출
		 * 추출된 값이 입력된 값보다 크면 해당 값을 누적하여 합한다
		 * 
		 * 3. 2번을 10번 반복한다.
		 * 
		 * 그래서 
		 *  입력값 : 
		 *  랜덤 값 : 
		 *  더한 횟수 : 
		 *  총합 : 
		 */
		
		int inputVal = 0; // 입력 값 지정 함수
		Scanner scan = new Scanner(System.in);
		
		System.out.println("값을 입력(1~100 사이) : ");
		inputVal = scan.nextInt();
		
		
		int sumCnt = 0; // 더해진 횟수
		int sum = 0;
		
		System.out.println("입력 값 : " + inputVal);
		
		if (inputVal <= 100) {
			
		System.out.print("랜덤 값 : ");
		
			for(int i = 0; i < 10; i++) {
		
			//랜덤 값을 이용하여 특정 값을 추출 (범위 1~100)
			int rand = (int)(Math.random() * 100) + 1;
			//추출된 값이 입력값보다 클 경우만
			if(rand > inputVal) {
				sum += rand; // 값을 누적
				sumCnt++; // 더한 횟수 증가
			}

		System.out.print(rand + " ");
	
	}
		
		// 줄바꿈
		System.out.println();
		System.out.println("더한 횟수 : " + sumCnt);
		System.out.println("총 합 : " + sum);
		
	}else {
		System.out.println("입력 값이 허용 범위를 넘습니다 1~100 사이를 입력하세요.");
	}
		//스캐너 닫기
		scan.close();
}
}