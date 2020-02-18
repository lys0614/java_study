package chap01;

public class CharBoolDemo {
	public static void main(String[] args) {
		//char 는 문자 1자를 표현하는 데이터 타입. 즉, 문자'열' 데이터가 아니란 소리
		//문자를 표현하기 위해서 홑따옴표를 사용함. 문자'열'을 표현할땐 쌍따옴표 
		//문자는 유니코드를 지원함(UTF-8)
		char ga1 = '가';
		char ga2 = '\uac00';//가 에 해당하는  유니코드(ac00) 값
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "가 아니면" + geojit + "입니다");
		
		//자바의 변수 선언 및 사용은 JS의 그것과 동일함
		//변수 선언시 데이터 타입을 입력한다는 차이점이 있음
		
		//상수
		// 변수와 같이 데이터를 저장하는 공간 이지만, 한번 선언하면 절대로 변하지 않음. 변경할 수도 없음.
		// 프로그램 실행 중에 데이터를 변경할 수 없는 변수
		// 사용법
		//  final double PI = 3.14; 같은 식으로 final 수식어를 붙이고 데이터 값을 동시에 반드시 선언해주어야 한다.
		// final double PI; 라고 변수 선언하고 PI = 3.14; 이런식으로 한번 데이터값 저장하는건 가능, 그 뒤에 데이터값 변경 후 저장은 에러띄움.
	}
}
