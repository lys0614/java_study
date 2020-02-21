package chap04;

public class CarDemo {

	public static void main(String[] args) {
		Car car = new Car();// car 라는 이름으로 Car 클래스를 인스턴스화
		car.name="말리부";//car 클래스에 있는 멤버변수인 name을 불러와서 말리부라는 데이터를 입력
		car.color="회색";//car 클래스에 있는 멤버변수인 color를 불러와서 회색이라는 데이터를 입력
		car.type="세단";//car 클래스에 있는 멤버변수인 type을 불러와서 세단이라는 데이터를 입력
		car.price="3000";//car 클래스에 있는 멤버변수인 price를 불러와서 3000이라는 데이터를 입력
		car.Output();//car 클래스에 있는 멤버메서드인 Output()을 불러와서 그 안에 있는 동작들을 실행한다고 선언
		
		
	}
}


class Car{//클래스 선언
	//클래스 멤버변수들 선언
	String price;
	String color;
	String type;
	String name;
	
	void Output() {//클래스 멤버메서드(멤버함수) 선언
		//메서드를 불러왔을때 실행할 동작 선언
		System.out.println("이름 : "+name+", 가격 : "+price+", 색상 : "+color+", 차종 : "+type);
	}
}