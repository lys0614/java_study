package chap06;

class SportsCar extends Car{
	void whoamI() {
		System.out.println("���� ������ī�̴�");
	}
}

public class PolymorDemo {

	public static void main(String[] args) {
	
		Vehicle[] vehicles = new Vehicle[2];
		//�θ�Ŭ���� Ÿ������ ������ �迭.
		vehicles[0] = new Car();//������ �迭�� �� ��Ҵ� �ڽ� Ŭ���� Ÿ��
		vehicles[1] = new SportsCar();
		
		for (Vehicle v : vehicles) {
			v.whoamI();
		}
		for(int i=0;i<vehicles.length;i++) {
			vehicles[i].whoamI();
		}
		
		
		
	}

}
