package chap07;
import chap07.Computer4;
import chap07.Controllable2;
import chap07.TV4;

public class ControllableDemo2 {

	public static void main(String[] args) {
		Controllable2[] controllable = {new TV4(), new Computer4()};
		
		for(Controllable2 c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable2.reset();
		
	}
	
}
