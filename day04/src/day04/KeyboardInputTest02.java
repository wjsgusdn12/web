package day04;

import java.util.Scanner;

public class KeyboardInputTest02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문자를 입력받아볼게요.
		System.out.println("문자를 입력하세요");
		
		// next()는 문자입력 대기.. 엔터치면 끝... 단 공백허용X (띄어쓰기 안됨)
		// 공백 또는 엔터키를 입력의 끝으로 인식
		String vall = scan.next();
		
		System.out.println("입력 값 : " + vall);
		
		System.out.println("문자를 입력하세요2");
		
		// 찌꺼기 날라기용으로 하나 쓴다
	
		scan.nextLine();
		
		// 문자를 입력
		// 공백을 허용
		// 엔터키치면 종료
		// 기존의 입력된 찌꺼기가 있으면 출력 시킨다.
		String val2 = scan.nextLine();
		
		System.out.println("입력 값 : " + val2);
		
		//닫기
		scan.close();
	}
}
