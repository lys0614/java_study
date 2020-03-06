package chap07;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Marine m = new Marine("마린", 100);
		m.move();
		m.stop();
		m.attack();
		
		Tank t = new Tank("탱크",300);
		t.move();
		t.stop();
		t.attack();
		
		Wraith w = new Wraith("레이스",200);
		w.move();
		w.stop();
		w.attack();
		
	}

}
