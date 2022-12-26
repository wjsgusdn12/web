package day08;

public class DoubleArrayTest01 {
	public static void main(String[] args) {
		
		// 선언
		int[][] arr01 = new int[3][4]; // 3개의 행과 4개의 열을 가지는 2차 배열
		// 선언2 - 열을 나중에 채울수 있다, 하지만 행은 무조건 선언되어야함.
		int[][] arr02 = new int[3][];
		// 선언3 - 값과 공간을 부여, 선언할때만 가능하다.
		int[][] arr03 = { {1,2,3,4} , {5,6,7,8} };
		
		System.out.println("arr03배열 변수 (1차 배열의 위치) : " + arr03);
		System.out.println("arr03[0] (1차 배열의 첫번째 행이 가진 열의 위치) : " + arr03[0]);
		System.out.println("arr03[0][1] (배열의 첫번째행의 두번째열의 값) : " + arr03[0][1]);
	}
}
