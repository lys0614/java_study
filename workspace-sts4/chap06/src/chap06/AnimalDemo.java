package chap06;

public class AnimalDemo {

	public static void main(String[] agrs) {
		
		Animal ani = new Animal();
		
		Eagle e = new Eagle();
		Tiger t = new Tiger();
		GoldFish gf = new GoldFish();
		
		e.eye = "���� ��";
		System.out.println(e.eye);
		e.eat();
		e.fly();
		e.sleep();
		
		t.eye="ȣ���� ��";
		System.out.println(t.eye);
		t.eat();
		t.run();
		t.sleep();
		
		gf.eye="�ݺؾ� ��";
		System.out.println(gf.eye);
		gf.eat();
		gf.swim();
		gf.sleep();
	}
}
