package javaReview2;
import java.lang.Math; // 자바의 수학 관련 클래스
public class Review5 {

	public static void main(String[] args) {
//		Rectangle rec1 = new Rectangle();
//		rec1.area1();
//		rec1.area2();
//		rec1.area4();
//		
//		MicroWaveOven oven = new MicroWaveOven();
//		oven.powerOn();
//		oven.start();
//		
//		MicroWaveOven oven1 = new MicroWaveOven(20);
//		oven1.powerOn();
//		oven1.start();
//		
//		MicroWaveOven oven2 = new MicroWaveOven('A');
//		oven2.powerOn();
//		oven2.start();
		
		//this() : 특정 생성자에서 다른 오버로딩된 생성자를 호출하는 명령어
//	Circle circle = new Circle();
//		circle.pi=3.14;
//		circle.radius=5;
//		circle.area1();
		//이건 private로 숨겨놔서 직접접근할수없어 사용불가함
//		Circle cl1 = new Circle();
//		Circle cl2 = new Circle(5);
//		Circle cl3 = new Circle(5, 3.14);
//		
//		cl1.area1();
//		cl2.area1();
//		cl3.area1();
		
		// static = 정적 멤버를 생성하는 키워드
		// 클래스가 메모리상에 등록됨가 동시에 같이 메모리에 등록됨
		// 클래스를 객체로 인스턴스화 하지 않아도 해당 멤버 변수 및 멤버 메서드를 사용할 수 있음
		// 해당 클래스를 객체로 인스턴스화 한 객체들은 해당 멤버 변수 및 멤버 메서드의 내용 공유함
		// static이 사용된 멤버는 일반 메서드 및 변수가 사용할 수 없음
		// static이 붙어있으면 static이 붙어있는 멤버만 사용이 가능함
				
		//Triangle 클래스를 따로 인스턴스화 하지 않고 해당 static 멤버 변수와 멤버 메서드를 사용
		Triangle.width = 10;
		Triangle.height = 20;
		Triangle.area();
		System.out.println("------------------");
		//Triangle 클래스를 인스턴스화 하고 객체를 생성하고 해당 멤버 변수와 멤버 메서드를 사용
		Triangle tri = new Triangle();
		tri.width2=10;
		tri.height2=5;
		tri.area2();
		tri.area();//원래 값이 나올수 없는 구존데 값 나옴
		//static을 사용하여 width, height가 메모리상에 공유되고 있기 때문에 사용이 가능함
		tri.width=10;
		tri.height=10;
		
		Triangle tr2 = new Triangle();	
		tr2.area2();
		
		int rnd = (int)(Math.random()*10);//0~9까지의 랜덤숫자를 발생시켜 rnd에 저장
	}
}
