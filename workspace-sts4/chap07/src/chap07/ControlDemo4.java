package chap07;

public class ControlDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV4 tv = new TV4();
		Computer4 com = new Computer4();
		
		tv.turnOff();
		tv.turnOn();
		tv.repair();//repair()은 Controllable2 의 디폴트 메서드, 그를 상속받아 사용한것 / 오버라이딩이 가능함 / 인터페이스지만 메서드 사용이 가능함(default 메서드는 가능) / static 메서드가 아니기 때문에 인터페이스명.메서드명 으로 접근이 불가능함 반드시 상속받아야만 사용가능 
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable2.reset();//static 메서드기 때문에 인터페이스명.메서드명 으로 접근이 가능
		//이 상황에서 오류나느 코드들 
//		tv.reset();//reset()은 인터페이스의 정적 메서드이기 때문에 인터페이스명.메서드명 으로 직접 호출해야한다
//		com.reset();
//		Controllable2.repair();//repair()은 인터페이스의 디폴트메서드기 때문에 상속을 통해서만 실행이 가능함
		//인터페이스는 멤버의 접근제한자로 private를 사용할 수 없음
	}

}
