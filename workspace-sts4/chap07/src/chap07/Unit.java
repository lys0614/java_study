package chap07;

public abstract class Unit {

	int hp;
	String name;
	
	Unit(String name, int hp){
		this.hp = hp;
		this.name=name;
	}
	
	void attack() {
		System.out.println("����");
	}
	
	void stop() {
		System.out.println("����");
	}
	
	abstract void move(); 
}
