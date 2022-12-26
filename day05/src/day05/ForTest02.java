package day05;

public class ForTest02 {
	public static void main(String[] args) {
		
		/*
		 * 1~50 사이 숫자를 무작위로 추출하여 10번 더한 결과를 출력하세요.
		 */
		int sum = 0;
		
		// 10번 반복
		for(int i = 1; i <= 10; i++) {
			
			int rand = (int)(Math.random() * 50) +1;
			// 추출한 숫자를 누적하여 더한다
			sum = sum + rand;
			// 어떤 숫자가 추출되었는지 출력, 반복할동안은 줄바뀌면 안되니까 print()로 찍는다.
			System.out.print(rand + " ");
		}
		
		// 줄바꿈
		System.out.println();
		// 결과 출력
		System.out.println("전체 합 : " + sum);
		
	}
}
