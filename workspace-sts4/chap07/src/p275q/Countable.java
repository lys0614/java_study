package p275q;

//인터페이스 Countable
//public interface Countable {
//	void count();
//}

//추상클래스 Countable
public abstract class Countable{
	protected String name;
	protected int num;
	Countable(String name, int num){
		this.name = name;
		this.num = num;
	}
	abstract void count();
}

class Bird extends Countable {
//	String name;
//	int num;
//	Bird(String name, int num) {
//		this.name = name;
//		this.num = num;
//	}
	//extends Countable 일 경우
	Bird(String name, int num){
		super(name, num);
	}
	void fly() {
		System.out.println(this.num+"마리 "+this.name+"이(가) 날아간다");
	}
	public void count() {
		this.num = 2;
		System.out.println(this.name+"(이)가 "+num+"마리 있다");
	}
}

class Tree extends Countable{
//	String name;
//	int num;
//	Tree(String a, int b){ 
//		this.name = a;
//		this.num =b;
//	}
	//extends Countable 일 경우 이거
	Tree(String a, int b){
		super(a, b);
	}
	void ripen() {
		System.out.println(this.num+"그루의 "+this.name+"에 열매가 잘 익었다");
	}
	
	public void count() {
		System.out.println(this.name+"(이)가 "+this.num+"그루 있다");
	}
}