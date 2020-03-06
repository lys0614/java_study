package chap07;

//추상 클래스 = 추상메서드가 1개이상 존재하는 클래스
public abstract class Shape {

	double pi = 3.14;
	//추상 메서드 = 메서드의 원형만 만들어놓은 메서드/ 실행코드 부분이 없음
	abstract void draw();
	
	public double findArea() {
		return 0.0;
	}
			
}
