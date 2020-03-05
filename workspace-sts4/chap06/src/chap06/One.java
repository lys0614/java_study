package chap06;

public class One {

	private int secret = 1;
	//private 접근제한자 -> 외부 접근 불가
	int roommate = 2;
	//default 접근제한자 -> 외부 package 에서 접근 안됨
	protected int child = 3;
	//protected 접근제한자 -> 이 클래스를 상속받는 클래스에서 접근 가능, 즉 자식 클래스는 접근가능
	public int anybody = 4;
	//public 접근제한자 -> 모든 영역에서 접근 가능
	
	private void show() {
		
	}
	
}
