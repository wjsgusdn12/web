package day05;

import java.util.Scanner; // ctrl + shift + O 자동 임포트

public class IfTest04 {
	public static void main(String[] args) {
		
		// 키보드 입력을 위한 스캐너 선언
		Scanner scan = new Scanner (System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();
		
		System.out.println("성별 입력 : ");
		String gender = scan.next();
		
		if(age >= 18 && (gender.equals("남자") || gender.equals("남성")) ) {
			System.out.println(name + "님은 성인 남성입니다");
		}else if(age >= 18 && (gender.equals("여자") || gender.equals("여성")) ) {
			System.out.println(name + "님은 성인 여성입니다");
		}if(age < 18 && (gender.equals("남자") || gender.equals("남성")) ) {
			System.out.println(name + "님은 남성이고 청소년입니다");
		}else if(age < 18 && (gender.equals("여자") || gender.equals("여성")) ) {
			System.out.println(name + "님은 여성이고 청소년입니다");
		}
		
		// 스캐너 닫기
		scan.close();
	}
}