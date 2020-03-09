package chap07;

public class CoinDemo1 {
	//인터페이스를 상속받지 않음

	public static void main(String[] args) {
		//Coin.DIME은 인터페이스가 가지고 있는 상수이므로 static 키워드가 사용되어있어 객체선언 따로 없이 인터페이스명.상수명 으로 사용할 수 이씀
		//인터페이스를 상속받지 않고 객체화 선언 안하고 인터페이스명.상수명 으로 사용한 것. 상속받지 않고 사용하려면 반드시 인터페이스명 을 붙여주어야 사용이 가능함.
		System.out.println("DIME 은 " + Coin.DIME + "센트 입니다");

	}

}
//인터페이스에서 사용할 수 있는 멤버는 상수, 추상메서드, 디폴트메서드, 정적메서드 만 사용할 수 있다.
//인터페이스의 멤버로 int PENNY를 선언할 수 있는 이유는 인터페이스에서는 변수를 final static만 할 수 있기 때문에 final static을 안적어도 자동으로 final static이 적용되어 생략된 상태기 때문임
interface Coin{
	//컴파일 시 자동으로 final static이 적용 됨
	int PENNY = 1, NICKEL=5, DIME=10, QUARTER=25;
}