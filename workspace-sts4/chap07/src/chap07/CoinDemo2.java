package chap07;

//클래스CoinDemo2 는 인터페이스 Coin을 상속받음
//인터페이스가 가지고 있는 상수도 상속받음.
public class CoinDemo2 implements Coin{

	public static void main(String[] args) {
	
		//인터페이스 Coin이 가지고 있는 상수 DIME도 상속받아서 DIME에 접근 시 인터페이스 명을 입력하지 않아도 됨.
		//아예 인터페이스 Coin 을 상속받아 인터페이스명.상수명 의 형태 없이 상수명 만 써서 사용한것
		//상속받았기 때문에 인터페이스명.상수명 을 쓸 필요가 없음
		System.out.println("Dime은 " + DIME + "센트 입니다");
	}

}
