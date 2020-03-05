package quiz;

public class Girl {

//	String name;
	protected String name;//상속받은 클래스는 접근가능
	
	void show() {//상속되는 메서드이기 때문에 오버라이딩이 가능해짐
		System.out.println(name+"는 자바 초보자이다");
	}
	
	public Girl(String name) {//매개변수가 있는 생성자
		this.name = name;
	}

}

class GoodGirl extends Girl{
	//GoodGirl 생성자가 없기 때문에 오류가 발생함. 컴파일러는 자동으로 기본 생성자를 생성하여 사용함
	public GoodGirl(String name){
		//Goodgirl 클래스는 Girl 클래스를 상속받았으므로 기본생성자에 super()가 입력되어 있음
		//super()은 부모 클래스인 Girl 의 기본 생성자를 호출하게 된다.
//		Girl 클래스엔 이미 다른 생성자가 있어 기본 생성자가 자동으로 출력되는 상황에선 오류가 발생한다.
//	그래서 기본 생성자를 공백이더라도 하나 만들어 주면 오류가 사라진다
		super(name);
	}
	
	void show() {
		System.out.println(this.name+"는 자바를 안다");
	}
//	
}

class BestGirl extends GoodGirl{

	BestGirl(String name){
		super(name);
	}
	
	void show() {
		System.out.println(this.name+"는 자바를 매우 잘 안다");
	}
	
}