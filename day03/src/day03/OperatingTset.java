package day03;

public class OperatingTset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte 	b1 	= 	10;
		byte 	b2 	= 	20;
		int 	i1 	= 	110;
		int 	i2 	= 	20;
		long 	l1 	= 	100;
		long 	l2 	= 	200;
		
		float 	f1 	= 	30.34f;
		double 	d1 	= 	30.3122;
		
		// int 이하로 더해봅시다.
		// byte bsum = b1 + b2; // 에러남.
		
		// 연산의 대상값의 데이터 타입이 모두 int 이하일 경우
		// 연산결과의 데이터 값은 무조건 int !
		int sum = b1 + b2 + i1;
		
		// 연산의 대상값의 데이터 타입이 모두 int 이상일 경우
		// 연산결과의 데이터 타입은 int 이상인 데이터타입 중 제일 큰 것으로 정해진다 
		double dsum = d1 + i1 + l1;
		
		// 숫자뒤에 L 또는 f 을 붙일경우 해당 숫자는 long 타입으로 변경된다.
		// int aa =145L; (long의 크기가 int 보다 높아서 에러)
		
		
	}

}
