package chap04;

public class CircleDemo6 {

	public static void main(String[] args) {
		
		Circle6 myCircle = new Circle6(10.0, "내꺼");
		Circle6 yourCircle = new Circle6(5.0, "니꺼");
		
		myCircle.print();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		
		System.out.println("카운트 후의 값");
		myCircle.print();
		
		System.out.println("--------------");
		yourCircle.print();
	}

}


class Circle6{
	double radius;//멤버변수1
	String name;
	int numCircles = 0;//멤버변수2
	static int numOfCircles = 0;//멤버변수3, static을 사용해 공유되고있는 멤버변수
	
	public Circle6(double radius, String name) {
		this.name = name;
		this.radius = radius;
	}
	
	public void Count() {
		numOfCircles++;
		numCircles++;
	}
	
	public void localValueUp() {
		numCircles++;
	}
	
	public void staticValueUp() {
		numOfCircles++;
	}
	
	public void print() {
		System.out.println(name + "의 numOfCircles 개수 : "+ Circle6.numOfCircles);
		System.out.println(name + "의 numCircles 걔수 : "+this.numCircles);
	}
}