package chap06;

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Good{
	
}

class Better extends Good{
	
}

final class Best extends Better{
	
}
//Best 클래스는 final class 이기 때문에 상속이안되서 에러가 나옴
//class NumberOne extends Best{
//	
//}