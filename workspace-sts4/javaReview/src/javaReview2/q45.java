package javaReview2;

public class q45 {
	
	public static void main(String[] args) {
		Car car1 = new Car("red");
		Car car2 = new Car("blue");
		Car car3 = new Car("RED");
		
		System.out.printf("�ڵ��� �� : %d, ������ �ڵ��� �� : %d\n",Car.getNumOfCar(), Car.getNumOfRedCar());
		
		Line a = new Line(1);//Line Ŭ������ �ν��Ͻ�ȭ �� ��ü a
		Line b = new Line(1);//Line Ŭ������ �ν��Ͻ�ȭ �� ��ü b
		//��ü a�� b�� ���� �ٸ� �޸𸮿� ������
		//��üa�� b�� �ܼ� ���ϸ� �޸𸮻��� ��ġ�� �ٸ��⶧���� �ٸ� ������ �ν��Ѵ�.
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
	
	//Car Ŭ������ ��������. ��ȯŸ���� �Է��ϴ� �κ� ��ü�� ����
	//Ŭ���� �̸��� ������ �̸��� �����ؾ��Ѵ�
	public Car(String a) {
		if(a == "red" || a=="RED") {
		NumOfCar++;
		NumOfRedCar++;
		}
		else if(a=="blue") {
			NumOfCar++;
		}
	}
	
	//Car Ŭ������ ��� �޼���
	public static int getNumOfCar() {
		return NumOfCar;
	}
	
	public static int getNumOfRedCar() {
		return NumOfRedCar;
	}
	
}