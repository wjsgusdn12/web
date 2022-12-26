package day07;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		// 배열 선언
		int[] arr01 = new int[5]; //5개 공간을 가지는 정수형 배열 선언
		// 값과 공간을 동시에 부여, 단 선언할 때만 가능
		int[] arr02 = {1, 2, 3, 4, 5};
		
		System.out.println("arr01 배열 출력 : " + arr01);
		System.out.println("arr02 배열 출력 : " + arr02);
		
		int a = 10;
		int b = 10;
		int c = 11;
		
		System.out.println("a 변수 값 저장 주소 : " + System.identityHashCode(a));
		System.out.println("b 변수 값 저장 주소 : " + System.identityHashCode(b));
		System.out.println("c 변수 값 저장 주소 : " + System.identityHashCode(c));
		
		b = 11;
		
		System.out.println("b 변수 값 저장 주소 : " + System.identityHashCode(b));
		
		
		// 배열 주소
		System.out.println("arr01 배열 주소 : " + System.identityHashCode(arr01));
		System.out.println("arr02 배열 주소 : " + System.identityHashCode(arr02));
	}
}
