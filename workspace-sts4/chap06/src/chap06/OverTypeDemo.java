package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {

//		
//		Vehicle v = new Car();
//		System.out.println(v.name);//부모클래스 타입의 멤버 변수 실행
//		v.whoamI();//오버라이딩 된 whoamI()가 실행됨
//		v.move();
		
		Vehicle v = new Vehicle();
		System.out.println(v.name);
		v.whoamI();
		v.move();
		
		System.out.println("------------");
		
		Car c = new Car();
		System.out.println(c.name);
		c.whoamI();
		c.move();
		
		System.out.println("------------");
		
		v=c;
		System.out.println(v.name);
		v.whoamI();
		v.move();
	}

}

class Vehicle{
	String name = "탈 것";
	
	void whoamI() {//상속되어 오버라이딩 될 메서드
		System.out.println("나는 탈 것이다.");
	}
	
	static void move() {//static이라 상속되지않음, 클래스의 멤버로서 공유되어 사용됨. 오버라이딩 불가
		System.out.println("이동하다");
	}
}

class Car extends Vehicle{
	String name = "자동차";
	
	void whoamI() {//부모클래스의 whoamI()를 오버라이딩함
		System.out.println("나는 자동차이다");
	}
	
	static void move() {
		System.out.println("달리다");
	}
}
