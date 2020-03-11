package chap10;

public class GenericClassDemo {

	public static void main(String[] args) {
		Cup c = new Cup();
		
		c.setBeverage(new Boricha());//Cup클래스 타입의 객체 c에 Boricha 클래스 타입의 객체 대입
		
		c.setBeverage(new Beer());//Cup 클래스 타입 객체 c에 Beer 클래스 타입 객체를 다시 대입
		//기존의 Boricha 크래스 타입의 객체가 삭제되고 Beer 클래스 타입의 객체로 변경
		
		try {
			Beer b1 = (Beer) c.getBeverage();//마지막으로 변경된 Beer 클래스 타입의 객체를 출력
			
			Boricha b2 = (Boricha) c.getBeverage();
			// c.setBeverage() 를 통해서 Beer 클래스 타입의 객체를 저장했기 때문에 기존의 Boricha 클래스 타입의 객체가 삭제되어 없음
			//문법상 오류는 없지만 런타임 예외를 발생시킴
		}
		catch(Exception e) {
			System.out.println("타입변환시 오류발생");
		}
		
	}
}


class Beer {}
class Boricha {}

class Cup<T> {
	private T beverage; // Object 클래스 타입의 멤버 변수
	
	public T getBeverage() {
		return beverage;
	}
	//Object 클래스 타입의 매개 변수
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}