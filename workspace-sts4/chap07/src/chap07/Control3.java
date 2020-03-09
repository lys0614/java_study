package chap07;

//인터페이스 끼리의 상속
//인터페이스는 부모인터페이스에서 상속받을 경우 extends 키워드 사용
//인터페이스는 다중상속을 지원함
public interface Control3 extends Control1, Control2{

	void ChannelUp();
	void ChannelDown();
	
}
