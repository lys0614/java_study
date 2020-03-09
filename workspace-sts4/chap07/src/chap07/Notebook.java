package chap07;

public class Notebook extends Computer4 implements Portable {

	@Override
	public void inMyBag() {
		System.out.println("³ëÆ®ºÏÀº °¡¹æ¿¡ ÀÖ´Ù");
	}

	public void turnOn() {
		System.out.println("³ëÆ®ºÏ ÄÔ");
	}
	
	public void turnOff() {
		System.out.println("³ëÆ®ºÏ ²û");
	}
	public static void main(String[] args) {

		Notebook n = new Notebook();
		
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}

}
