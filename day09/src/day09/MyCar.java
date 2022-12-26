package day09;

public class MyCar {
	
	// 멤버 (인스턴스) 변수
	public int price;
	public String carName;
	public int speed;
	
	// 메서드를 써보자. - 매개 변수도 없고, 리턴도 없음
	public void start() {
		System.out.println("차량 시동이 켜집니다");
	}
	
	// 매개변수 있고 리턴 없는 메서드
	public void upSpeed(int up) {
		speed = speed + up;
	}
	
	// 매개변수 없고 리턴이 없는 메서드
	public String getInfo() {
		String str = "차 종 : " + carName + ", 가격 : " + price;
		return str;
	}
}