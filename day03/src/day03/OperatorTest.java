package day03;

public class OperatorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int sum = 0;
		
		// 증강연산자가 뒤에 오는 경우
		sum = num++;
		
		System.out.println("sum = " + sum + ", num = " + num);
		
		// 증강연산자가 앞에 오는 경우
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num = " + num);
	}

}
