package p275q;

//�������̽� Countable
//public interface Countable {
//	void count();
//}

//�߻�Ŭ���� Countable
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
	//extends Countable �� ���
	Bird(String name, int num){
		super(name, num);
	}
	void fly() {
		System.out.println(this.num+"���� "+this.name+"��(��) ���ư���");
	}
	public void count() {
		this.num = 2;
		System.out.println(this.name+"(��)�� "+num+"���� �ִ�");
	}
}

class Tree extends Countable{
//	String name;
//	int num;
//	Tree(String a, int b){ 
//		this.name = a;
//		this.num =b;
//	}
	//extends Countable �� ��� �̰�
	Tree(String a, int b){
		super(a, b);
	}
	void ripen() {
		System.out.println(this.num+"�׷��� "+this.name+"�� ���Ű� �� �;���");
	}
	
	public void count() {
		System.out.println(this.name+"(��)�� "+this.num+"�׷� �ִ�");
	}
}