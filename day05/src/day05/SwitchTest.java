package day05;

public class SwitchTest {
	public static void main(String[] args) {
		
		int score = 87;
		
		System.out.println("점수 : " + score);
		// 정수 또는 문자열 비교 가능
		switch(score / 10) {
		
//		case 10 : 
//			System.out.println("A 학점!");
//			break;
		case 10, 9 : 
			System.out.println("A 학점!");
			break;
		case 8 : 
			System.out.println("B 학점!");
			break;
		case 7 : 
			System.out.println("C 학점!");
			break;
		default : 
			System.out.println("F 학점!");
		}
	}
}
