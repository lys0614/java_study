package chap07_031001;

public class ContollerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = { new TV(false,"TV"), new Radio(true,"����")};
		
		for(Controller con : c) {
			con.show();
		}
	}

}

abstract class Controller{
	boolean power;
	
	Controller(boolean b){
		this.power = b;
	}
	void show() {}
	
	abstract String getName();
}

class TV extends Controller {
	String name;
	
	TV(boolean b, String s){
		super(b);//�θ�Ŭ������ �����ڸ� ȣ���ϴ� �κ�
		//�θ�Ŭ������ �����ڰ� ���� ��� �����Ϸ��� �ڵ����� �����Ͽ� ������
		//�ڽ�Ŭ�������� �θ�Ŭ������ �⺻�����ڸ� ȣ������ ������ �����Ϸ��� �ڵ����� ȣ����.
		this.name = s;
	}
	String getName() {
		return name;
	}
	void show() {
		if(power == true) {
			System.out.println(name + "�� ��������");
		}
		else System.out.println(name + "�� ��������");
	}
}

class Radio extends Controller {
	String name;
	
	Radio(boolean b, String s){
		super(b);
		this.name = s;
	}
	
	String getName() {
		return name;
	}
	
	void show() {
		if(power == true) {
			System.out.println(name + "�� ��������");
		}
		else System.out.println(name + "�� ��������");
	}
}