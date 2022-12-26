package day07;

import java.util.Scanner;

public class BreakTest {
	public static void main(String[] args) {
		
		int target = 22;
		Scanner scan = new Scanner(System.in);
		boolean isFind = false;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("찾을 숫자 : ");
			int find = scan.nextInt();
			
			if(find == target) {
				System.out.println((i + 1) + "번만에 찾음!");
				isFind = true;
				break; // 여기서 반복 종료
			}else if(find > target) {
				System.out.println("값이 더 작습니다.");
			}else if(find < target) {
				System.out.println("값이 더 큽니다.");
		}
		
	}
		
		if(!isFind) {
			System.out.println("찾을 값은 " + target + "이었습니다..");
		}
		//스캐너 닫기
		scan.close();

	}
	
}
