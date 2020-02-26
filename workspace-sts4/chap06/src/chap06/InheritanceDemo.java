package chap06;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		//클래스 Circle 을 사용
		Circle c = new Circle();
		//클래스 Ball 사용, Circle 클래스를 상속받은 클래스 Ball
		Ball b = new Ball("빨간색");
		
		//c는 private를 사용한 secret()메서드를 제외한 findRadius(), findArea() 메서드를 사용할 수 있다.
		System.out.println("원 : ");
		c.findRadius();
		c.findArea();

		//b는 Circle클래스를 상속받아서 findRadius(), findArea()를 사용할 수 있고, Ball 클래스에 있는 findColor(), findVolume()메서드도 사용할 수 있다.
		System.out.println("\n공 : ");
		b.findRadius();
		b.findColor();
		b.findArea();
		b.findVolume();
		
	}

}
