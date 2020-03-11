package chap10;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup2<Boricha> c = new Cup2<Boricha>();
		Cup2<Beer> b = new Cup2<Beer>();
		c.setBeverage(new Boricha());
//		c.setBeverage(new Beer()); Cup2 클래스 타입의 객체 c는 Boricha 클래스 타입으로 고정되어 있으므로 Beer클래스 타입의 객체를 대입할 수 없음, 저장도 할 수 없음
		
//		Beer b = c.getBeverage(); Cup2 클래스 타입의 객체 c는 Boricha 클래스 타입으로 고정되어 있으므로 Beer클래스 타입의 객체를 대입할 수 없음
		Boricha b1 = c.getBeverage();
		
	}

}

class Cup2<T>{//제네릭 타입으로 클래스 선언
	
	private T beverage; // T 타입의 멤버 변수
	
	public T getBeverage() {//T타입으로 멤버 변수값 출력
		return beverage;
	}
	//T 타입의 매개 변수
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}