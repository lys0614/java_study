package chap04;

public class Calculator2 {

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2(5,9);//메서드(함수)실행하는 형태로 생성자를 호출함. 메서드 호출해서 실행할때도 같은 형태임.
//		cal2.a = 10;
//		cal2.b = 5;
		cal2.sum();
		
		//생성자 오버로딩 하기
		//오버로딩 = 같은 이름의 메서드에 다른 매개변수 개수, 다른 데이터 타입을 지니고 있는 것들은 다른 메서드로 취급한다
		Cal3 cal3 = new Cal3(111, 27);//메서드(함수)실행하는 형태로 생성자를 호출함. 메서드 호출해서 실행할때도 같은 형태임.
		cal3.sum();
		cal3.sub();
		cal3.mul();
		cal3.div();
		
		Cal3 cal31 = new Cal3();
		cal31.sum();
		cal31.sub();
		cal31.mul();
		cal31.div();
		
		Cal3 cal32 = new Cal3(5);
		cal32.mul();
	}
	
}

class Cal2{//Calculator2 의 외부 클래스 Cal2
	int a; // 사용자가 따로 초기화하지 않아서 기본값인 0이 들어감
	int b;
	
	public Cal2(int x, int y) {//생성자 메서드, 생성자라서 new 키워드 뒤에 생성자 이름을 넣으면 자동으로 공백생성자가 만들어짐
		a=x; b=y;
	}
	
	public void sum() {//Cal2의 멤버 메서드
		int c= a+b;
		System.out.println(a+"+"+b+" = "+c);
	}
}

class Cal3{//Calculator2 외부클래스 Cal3
	private int a, b;//사용자가 따로 초기화 하지 않아서 기본값인 0이 들어감 private이기 때문에 Calculator2에서 생성자 호출을 통해 불러오더라도 이 값은 Calculator2에서 변경불가
	
	//생성자
	//생성자는 이름이 클래스와 동일해야함
	//생성자는 반환타입이 없음
	//사용자가 생성자를 만들지 않았을 경우 자동으로 컴파일러가 공백 생성자를 만듦
	//생성자가 내용이 빈 생성자를 만들었을 경우 컴파일러는 공백 생성자를 만들지 않음.
	//사용자가 생성자를 하나라도 만들었을 경우 컴파일러는 공백생성자를 만들지 않음
	//생성자도 오버로딩 가능함
	public Cal3() {// 생성자 메서드
		a=10;
		b=5;
	}
	
	public Cal3(int x) {//매개변수로 값을 1개 받아서 멤버변수를 초기화
		a= x;
		b= a-(a/2);
	}
	
	public Cal3(int x, int y) {
		a=x;
		b=y;
	}
	
	public void sum() {
		int c = a+b;
		System.out.println(a+"+"+b+" = "+c);
	}
	
	public void sub() { // Cal3의 멤버 메서드.
		int c = a-b;
		System.out.println(a+"-"+b+" = "+c);
	}
	
	public void mul() {
		int c = a*b;
		System.out.println(a+"*"+b+" = "+c);
	}
	
	public void div() {
		int c = a/b;
		System.out.println(a+"/"+b+" = "+c);
	}
	
}