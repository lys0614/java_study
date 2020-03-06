package chap07;
//인터페이스 선언
//인터페이스는 기본적으로 추상메서드만 가지고있음
//인터페이스는 다중상속을 지원함
//상속받을 추상메서드를 반드시 사용하게끔 유도함
public interface Controllable {
	//추상메서드
	//추상메서드는 반드시 상속받는 클래스에서 구현해서 사용해야 한다. 직접사용하지 못함
	void turnOn();
	void turnOff();
}
