package day04;

public class IfTest02 {
	public static void main(String[] args) {
		
		// 60 <= x <= 100
		int score = (int)(Math.random() * (100 - 60 + 1)) + 60;
		
		if(score >= 90) {
			System.out.println("정수 : " + score + ", 학점 : A");
		}else if(score >= 80) {
			System.out.println("정수 : " + score + ", 학점 : B");
		}else if(score >= 70) {
			System.out.println("정수 : " + score + ", 학점 : C");
		}else {
			System.out.println("정수 : " + score + ", 학점 : F");
		}
		
	}

}