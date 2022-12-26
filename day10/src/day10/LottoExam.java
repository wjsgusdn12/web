package day10;

import java.util.Arrays;
import java.util.Scanner;

public class LottoExam {
	public static void main(String[] args) {
		
		/*
		 * system 로또 번호 : 6개 + 보너스 번호 1개
		 * 랜덤 함수
		 * 배열(니꺼, 내꺼)
		 * 플레이어 : 번호 6개
		 * 스캐너
		 */
		
		int[] lotto = new int[6]; // system 로또 배열
		int bonusNum = 0; // 보너스 번호 저장 변수
		
		int count = 0; // 번호 개수 카운트
		// 시스템은 6 + 보너스 1 = 7개
		while(count < 7) {
			int temp = (int)(Math.random() * 45) +1;
			for(int i = 0; i < count; i++) {
				if(lotto[i] == temp) {
					temp = 0; // 중복이 있으면 0으로 변경한다.
					break;
				}
			}
			// 중복이 아님
			if(temp > 0) {
				if(count < 6) {
					//로또 번호
					lotto[count] = temp;
				}else {
					// 6개 다 만들었으면 마지막은 보너스 번호
					bonusNum = temp;
				}
				count++; // 번호 만들었으니 카운트 증가
			}
		}
		System.out.println("로또번호 : " + Arrays.toString(lotto) + ", 보너스 번호 : " + bonusNum);
		
		// 플레이어
		int[] player = new int[6];
		Scanner scan = new Scanner(System.in);
		count = 0; // 카운트 다시 쓰기위해서 초기화
		
		for(int i = 0; i < 6; i++) {
			System.out.println((i+1) + "번째 번호 입력 : ");
			player[i] = scan.nextInt();
			
			if(player[i] < 1 || player[i] > 45) {
				System.out.println("입력값이 올바르지 않습니다, 확인해주세요");
				i--; // i가 다시 돌아와야해서 뺌
				continue; // 입력이 잘못되었으면 중복비교도 필요없음
			}
			
			// 중복체크
			for(int j = 0; j < i; j++) {
				if(player[i] == player[j]) {
					i--;
					System.out.println("이미 입력한 번호입니다");
					break; // 중복을 찾았으니 루프 종료
					}
				}
			}
		System.out.println("유저 로또번호 : " + Arrays.toString(player));
		
		int matchCount = 0; // 맞은 개수
		int[] matchNumbers = new int[6]; // 맞은 번호 저장 배열
		boolean isBonus = false; // 보너스 번호 유무
		// 비교 !
		for(int i = 0; i < player.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				// 당첨번호가 맞으면 개수 증가, 번호 저장
				if(player[i] == lotto[j]) {
					matchNumbers[matchCount++] = player[i];
					break;
				}
			}
			// 보너스 번호 못찾을 경우만 비교
			if(!isBonus) {
				if(player[i] == bonusNum) {
					isBonus = true;
				}
			}
			
		}
		// 결과
		System.out.print("당첨 번호 : ");
		// 배열은 6개 고정, 출력은 맞은 개수만큼만 가져오면 된다
		for(int i = 0; i < matchCount; i++) {
			System.out.print(matchNumbers[i] +" ");
		}
		if(matchCount == 5 && isBonus) {
			System.out.print(", 보너스 번호 : " + bonusNum);
		}
		// 줄바꿈
		System.out.println();
		
		if(matchCount == 6) {
			System.out.println("와우!! 1등입니다!! 대단해요!!");
		}else if(matchCount == 5 && isBonus) {
			System.out.println("와우!! 2등입니다!! 대단해요!!");
		}else if(matchCount == 5) {
			System.out.println("와우!! 3등입니다!!");
		}else if(matchCount == 4) {
			System.out.println("4등입니다!!");
		}else if(matchCount == 3) {
			System.out.println("5등입니다!!");
		}else {
			System.out.println("아쉽네요.. 낙점입니다.. 다음에는 대박!!");
		}
	
	}
}