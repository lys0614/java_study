package javaReview2;

public class q45 {
	
	public static void main(String[] args) {
		Car car1 = new Car("red");
		Car car2 = new Car("blue");
		Car car3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d\n",Car.getNumOfCar(), Car.getNumOfRedCar());
		
		Line a = new Line(1);//Line 클래스를 인스턴스화 한 객체 a
		Line b = new Line(1);//Line 클래스를 인스턴스화 한 객체 b
		//객체 a와 b는 서로 다른 메모리에 존재함
		//객체a와 b를 단순 비교하면 메모리상의 위치가 다르기때문에 다른 값으로 인식한다.
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}
}

class Line {

	private int length;
	
	public Line(int a) {
		this.length = a;
	}
	
	boolean isSameLine(Line o) {
		boolean result = false;
		if (o.length == this.length) {
			result = true;
		}
		return result;
	}
	
}

class Car {
	
	private static int NumOfCar;
	private static int NumOfRedCar;
	
	//Car 클래스의 생성자임. 반환타입을 입력하는 부분 자체가 없음
	//클래스 이름과 생성자 이름이 동일해야한다
	public Car(String a) {
		if(a == "red" || a=="RED") {
		NumOfCar++;
		NumOfRedCar++;
		}
		else if(a=="blue") {
			NumOfCar++;
		}
	}
	
	//Car 클래스의 멤버 메서드
	public static int getNumOfCar() {
		return NumOfCar;
	}
	
	public static int getNumOfRedCar() {
		return NumOfRedCar;
	}
	
}