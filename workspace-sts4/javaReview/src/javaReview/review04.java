package javaReview;

public class review04 {

	public static void main(String[] args) {
		
	//클래스 : 일종의 프로그램 설계도, 멤버 변수와 멤버 메서드를 가지고 있는 참조 타입. 특정 기능을 수행하기 위해서 필요한 변수와
	// 특정 기능을 수행하는 메ㅓ드들을 하나의 이름으로 묶어서 모아둔 것
		
		Cal cal = new Cal();
		int sum = cal.sum(20, 5); // Cal 클래스의 sum 함수를 실행, 반환값을 변수 sum에 저장.
		
		//Television 클래스를 인스턴스화 하여 객체로 생성
		Television tv = new Television("701");
		//Televesion 클래스를 개체로 만들었기 때문에 Television 클래스의 멤버 변수와 멤버 메서드를 사용할수 있음.
		//클래스 또한 일종의 데이터 타입이기 때문에 변수로 선언해서 사용할 수 있다. 는 개념을 알고 가는게 좋다.
		tv.powerOn();
		tv.channelUp();
		tv.volumeUp();
		System.out.println("--------------------------");
		Television tv1 = new Television("702");
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();
		tv1.volumeUp();
		
	}
	
}

class Cal{
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}