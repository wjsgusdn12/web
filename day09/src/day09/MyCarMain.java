package day09;

public class MyCarMain {
	public static void main(String[] args) {
		
		/*
		 * 클래스는 작성 한 후 실체 사용하려면
		 * 메모리에 적용해야한다
		 * 자바의 프로그래밍이 동작하는 메모리 영역을 heap(힙) 영역이라고함. 
		 */
		MyCar mycar = new MyCar(); // <- 객체 선언이라고 부름, 스캐너와 공식 같음(?) -> Scanner scan = new Scanner();, mycar = 생성자 = 인스턴스 = 클래스의 변수
		
		mycar.carName = "붕붕이"; //.은 연결고리(접근키워드)
		mycar.price = 30000000; //mycar가 가지고 있는 price에 30000000을 입력한것
		
		// 호출형 함수로부터 자동차 정보를 얻는다
		String info = mycar.getInfo();
		
		System.out.println(info);
	}
}

// 교보문고
// 자바 교제 추천 - 
// 상 - 이것이 자바다(레벨3.5), do it 자바 완전 정복 초록색
// 중 - do it 자바 완전 정복 빨간색(레벨3)
// 하 - do it 자바 프로그래밍 입문, 혼자 공부하는 자바(레벨1), 처음 해보는 자바 프로그래밍, 이재환의 자바프로그래밍 입문(레벨2)