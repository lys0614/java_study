package javaReview;

public class main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.powerOn();
		car.colorCheck("red");
		car.sizeCheck("4�ν�");
		car.speedCheck("����");
		car.typeCheck("����");
		car.fuelCheck("LPG");
		car.moveCheck("�̵�");
		car.color();
		car.size();
		car.type();
		car.fuel();
		car.status();

		System.out.println("---------------------------");
		
		Phone phone = new Phone();
		
		phone.powerOn();
		phone.sendCall();
		phone.endCall(1);
		phone.endCall(1);
		phone.takeCall();
		phone.endCall(1);
		phone.Calling("phone2");
		System.out.println("---------------------------");
		Phone phone2 = new Phone();
		phone2.powerOff();
		phone2.sendCall();
		phone2.endCall(1);
		phone2.takeCall();
		phone2.endCall(1);
		phone2.Calling("phone");

	}
}
