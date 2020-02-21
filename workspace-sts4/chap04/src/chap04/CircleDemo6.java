package chap04;

public class CircleDemo6 {

	public static void main(String[] args) {
		
		Circle6 myCircle = new Circle6(10.0, "����");
		Circle6 yourCircle = new Circle6(5.0, "�ϲ�");
		
		myCircle.print();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		
		System.out.println("ī��Ʈ ���� ��");
		myCircle.print();
		
		System.out.println("--------------");
		yourCircle.print();
	}

}


class Circle6{
	double radius;//�������1
	String name;
	int numCircles = 0;//�������2
	static int numOfCircles = 0;//�������3, static�� ����� �����ǰ��ִ� �������
	
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
		System.out.println(name + "�� numOfCircles ���� : "+ Circle6.numOfCircles);
		System.out.println(name + "�� numCircles �¼� : "+this.numCircles);
	}
}