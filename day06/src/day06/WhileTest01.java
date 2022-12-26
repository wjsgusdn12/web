package day06;

public class WhileTest01 {
	public static void main(String[] args) {
		
		int count = 0;
		int a=10;
		
		for(; a>count;) {
			count++;
			System.out.print(count +" ");
		}
		System.out.println();
		count = 0;
		while(a>count) {
			count++;
			System.out.print(count +" ");
		}
	}
}
