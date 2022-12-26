package day07;

public class ContinueTest {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			// 2로 나눈 나머지가 1이라면 홀수
			if(i % 2 == 1) {
				// 컨티뉴를 만나는 시점에서 실행문이 종료
				continue;
			}
			sum = sum + i;
		}
		
		System.out.println("합 : " + sum);
		
	}
}
