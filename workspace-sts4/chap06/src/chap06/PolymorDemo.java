package chap06;

class SportsCar extends Car{
	void whoamI() {
		System.out.println("나는 스포츠카이다");
	}
}

public class PolymorDemo {

	public static void main(String[] args) {
	
		Vehicle[] vehicles = new Vehicle[2];
		//부모클래스 타입으로 선언한 배열.
		vehicles[0] = new Car();//실제로 배열에 들어간 요소는 자식 클래스 타입
		vehicles[1] = new SportsCar();
		
		for (Vehicle v : vehicles) {
			v.whoamI();
		}
		for(int i=0;i<vehicles.length;i++) {
			vehicles[i].whoamI();
		}
		
		
		
	}

}
