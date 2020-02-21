package chap04;

public class LocalVariableDemo {

	public static void main(String[] args) {
	int a = 0;//지역변수, 값 초기화함
	double d;//지역변수 값 초기화 안함.
	// System.out.print(b); // 변수 데이터를 초기화하지 않았으므로 사용이 불가능
	int c = 0;
//	public double d = 0.0; // 지역변수는 final 만 사용가능함.
	for(int e = 0; e < 10; e++) {
		System.out.print(e);
	}

	}

}
