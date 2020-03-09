package chap07;

public interface Controllable2 {

	//인터페이스에는 디폴트메서드, 정적메서드가 멤버로 올수 있음
	
	//디폴트 메서드 사용
	default void repair() {
		System.out.println("장비를 수리한다");
	}
	
	//정적 메서드 사용
	static void reset() {
		System.out.println("장비를 초기화한다");
	}
	void turnOn();
	void turnOff();
}
