package chap04;

class Circle03{
	private double rad; // private 선언된 멤버변수들은 해당 클래스 내에서만 사용 가능함.
	double radius;//Circle 의 멤버 변수
	//멤버 변수나 멤버 메서드에 접근 제한자를 private로 설정하면 외부에서 접근이 불가능함
	// 변수명 우클릭해서 Refactor 가면 getter setter 자동으로 세팅해주는 Encapsule 옵션이 있음
//	
//	public double getRad(){//private로 잠긴 rad를 외부에서 가져가게 해주는 getter()
//		return rad;
//	}
//	public void setRad(double value) {//private로 잠긴 rad를 외부에서 설정할수있게 해주는 setter();
//		rad = value;
//	}
//	
	double findArea() {//Circle의 멤버 메서드(함수)
		return 3.14*radius*radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x,y);
	}

	double getRad() {
		return rad;
	}

	void setRad(double radius) {
		this.rad = radius;
	}
	double findArea2() {//Circle의 멤버 메서드(함수)
		return 3.14*rad*rad;
	}
}

public class CirclrDemo3 {

	public static void main(String[] args) {
		
		Circle03 myCircle = new Circle03();
		myCircle.radius=10.0;//Circle03 클래스에 직접접근 하는것.
		//값을 직접 입력하는 형태이기 때문에 입력한 값이 정확한지 검증할 수 없음
		//중요한 멤버 변수, 멤버 메서드의 경우는 외부로 노출시키지 않고, getter, setter 등을 통하여 데이터를 입력하고 가져오는 방식을 사용함
		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.setRad(12.0);//setter를 통해 Circle03에 잇는 private double Rad 에 12를 넣음.
		double myrad = myCircle.getRad();//getter를 통해 Circle03에 있는 private double Rad를 가져옴
		myCircle.show(myrad, myCircle.findArea2());
	}
}
