package chap06;

public class AnimalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mammal ape = new mammal();
		mammal lion = new mammal("사자");
	}

}

class animal2{
	public animal2(String s) {
		System.out.println("동물 : "+s);
	}
}

class mammal extends animal2{
	public mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}
	
	public mammal(String s) {
		super(s);
		System.out.println("포유류 : "+s);
	}
}
