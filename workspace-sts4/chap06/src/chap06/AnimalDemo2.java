package chap06;

public class AnimalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mammal ape = new mammal();
		mammal lion = new mammal("����");
	}

}

class animal2{
	public animal2(String s) {
		System.out.println("���� : "+s);
	}
}

class mammal extends animal2{
	public mammal() {
		super("������");
		System.out.println("������ : ������");
	}
	
	public mammal(String s) {
		super(s);
		System.out.println("������ : "+s);
	}
}
