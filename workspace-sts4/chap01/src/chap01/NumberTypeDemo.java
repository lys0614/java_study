package chap01;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서는 변수 선언 시 해당 데이터 타입을 반드시 입력해야함
		// 숫자형 데이터 타입의 기본인 int를 주로 사용함
		// 32bit cpu를 사용하면서붜 int크기를 32bit로 선언함
		// 64bit cpu가 주력이지만 아직도 int는 32bit로 선언되어잇음
		
		int mach; // 메모리에 변수만 선언
		int distance;
		mach = 340; // 변수에 데이터 저장
		distance = mach * 60 * 60 ; // 변수에 데이터값을 연산한 후 저장 
		
		System.out.println("소리가 1시간동안 가는 거리 : "+ distance +"m");
		
		double radius; // 실수형 변수를 메모리에 선언
		double area;
		
		//double 형은 기본형이기 때문에 데이터 뒤에 수식단어가 필요 없음.
		//float 일 경우 데이터 끝에 f 를 붙여주어야 함
		//float 은 double보다 메모리를 덜 사용해서 쓴다
		radius = 10.0; // 실수형 변수에 데이터 저장
		area = radius * radius * 3.14; // 실수형 변수에 데이터값을 연산한 후 저장
		System.out.println("반지름이 " + radius + "인 원의 넓이 : "+area);
	}

}
