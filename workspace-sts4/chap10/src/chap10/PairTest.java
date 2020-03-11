package chap10;

public class PairTest {

	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair<>(10, 20);
		Pair<Double> p2 = new Pair<>(10.0, 20.0);
		
		System.out.println(p1.first());
		System.out.println(p2.second());
	}
}


//제네릭 클래스 생성
//Number 클래스를 상속받아서 숫자형만 사용가능하도록 제한
class Pair<T extends Number>{
	//<T extends Number> 는 숫자형만 사용 가능하게 T형태를 고정시킨다는 뜻.
	private T num1;//어떠한 숫자 타입이든 모두 대입이 가능한 제네릭 타입 멤버 변수
	private T num2;
	
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T first(){
		return num1;
	}
	public T second(){
		return num2;
	}
}