package chap07;

interface Movable{
	void move(int x);
}

class Car implements Movable{
	private int pos = 0;
	public void move(int x) {
		pos+=x;
	}
	public void show() {
		System.out.println(pos+"만큼 이동함");
	}
}


public class MovableDemo {

	public static void main(String[] args) {
		
		Movable m = new Car();
		
		m.move(5);
		//m.show(); Movable 타입으로 호출한 Car 객체 m은  show()를 호출할 수없다
		//show()메서드는 Car클래스 고유의 메서드기 때문에 사용할 수 없음.
		
		//원본이 자식 클래스 타입이었으면 다시 자식크래스 타입으로 변환이 가능함
		//이 때, 강제 타입 변환을 실행해야 한다
		Car c = (Car)m;
		c.move(10);
		c.show();

	}

}
