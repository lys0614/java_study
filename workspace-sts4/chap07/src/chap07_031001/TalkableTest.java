package chap07_031001;

public class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		speak(new Korean());
		speak(new American());
	}

	static void speak(Talkable t) {
		//두개의 클래스의 모두의 부모 클래스 혹은 부모 인터페이스, Object타입
		//정적 메서드에 매개변수로 Talkable 타입의 변수를 받아  talkable 의 자식 클래스에 퍼져있는 메서드들의  사용방식을 통일한것
		t.talk();
	}
}
