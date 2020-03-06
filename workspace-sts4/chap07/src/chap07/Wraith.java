package chap07;

public class Wraith extends Unit {
	public Wraith(String name, int hp) {
		super(name,hp);
	}
	
	public void move() {
		System.out.println("레이스 이동함");
	}
}
