package day03;

public class IfTest {

	public static void main(String[] args) {

		// int(Math.random()*k)+1 의 랜덤함수의 최대값 = k
		
		/*
		 *  Math 는 수학의 기능을 모아놓은 서비스 클래스
		 *  random() 함수는 0 <= x < 1 사이에서 랜덤값 발생 (최대 0.999~) --> 0 <= x <= 0.999~
		 *  
		 *  Math.random() * 100   0 <= x < 100 여가서 x는 함수(최대 99.999~) --> 0 <= x <= 99.999~
		 * 
		 *  (int)(Math.random() * 100)			0 <= x <= 99
		 *  
		 *  (int)(Math.random() * 100) + 1		1 <= x <= 100
		 *  
		 *  수식에서 곱하는, 대상이 최댓값이 된다, 더하는 값이 최소값
		 *  
		 */
		
		int rand = (int)(Math.random() * 100) +1;
		
		if(rand >= 50) {
			System.out.println("합격! 정수는 : " + rand);
		}else {
			System.out.println("불합격! 점수는 : " + rand);
		}

	}

}
