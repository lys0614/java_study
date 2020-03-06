package p249q4;

public class main {

	public static void main(String[] args) {
		Parent p = new Child();//클래스의 다형성 특성을 이용해서 부모 클래스 타입으로 자식 객체를 만듦
		System.out.println(p.name);
		p.print();

	}

}
