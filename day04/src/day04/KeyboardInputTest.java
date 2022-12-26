package day04;

import java.util.Scanner; //ctrl + shift + O 임포트 자동입력

public class KeyboardInputTest {
	public static void main(String[] args) {
		
//		 Scanner 클래스를 사용하면 키보드 입력을 쉽게 받을 수 있다.
//		 클래스를 사용하려면 선언을 해야한다.
		Scanner scan = new Scanner(System.in);

//		숫자를 입력
		System.out.println("숫자를 입력하세요.");
//		 키보드로부터 숫자입력을 대기
//		 입력 후 엔터를 치면 입력한 값 을 읽어서 변수에 준다.
//		 만약 숫자가 아닌 (문자나 띄어쓰기)를 쓰면 에러남.
		
		/*
		 * 숫자는 nextInt() 	또는 nextLong() 	또는 nextByte() ... 등
		 * 문장은 next()		또는 nextLine()	
		 */
		int val = scan.nextInt();
		
		System.out.println("입력 값 : " + val);

//		스캐너를 닫아준다
		scan.close();
	}

}
