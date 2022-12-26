package day05;

public class ForTest01 {
	public static void main(String[] args) {
		
		// 반복문 for를 이용해서 1부터 10까지 합을 구해봅시다
	
		// 반복문을 사용하지 않는 경우는?
		int sum = 0;
		sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("합 : " + sum);
		
		// 초기화
		sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("합 : " + sum);
	}
}
