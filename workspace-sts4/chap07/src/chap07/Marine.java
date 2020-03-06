package chap07;

public class Marine extends Unit{
	public Marine(String name, int hp) {
		super(name,hp);
	}
	
	public void move() {
		System.out.println("마린 이동함");
	}
}
