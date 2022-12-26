package day06;

public class DoubleLoopTest01 {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++) {
				System.out.print(j +"X"+i+"="+(i*j)+"\t");
			}
			// 답이 끝날때마다 줄을 바꿈
			System.out.println();
		}
	}
}
