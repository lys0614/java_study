package chap07_031001;

public class ContollerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = { new TV(false,"TV"), new Radio(true,"라디오")};
		
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
		super(b);//부모클래스의 생성자를 호출하는 부분
		//부모클래스에 생성자가 없을 경우 컴파일러가 자동으로 생성하여 실행함
		//자식클래스에서 부모클래스의 기본생성자를 호출하지 않으면 컴파일러가 자동으로 호출함.
		this.name = s;
	}
	String getName() {
		return name;
	}
	void show() {
		if(power == true) {
			System.out.println(name + "가 켜져있음");
		}
		else System.out.println(name + "가 꺼져있음");
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
			System.out.println(name + "가 켜져있음");
		}
		else System.out.println(name + "가 꺼져있음");
	}
}