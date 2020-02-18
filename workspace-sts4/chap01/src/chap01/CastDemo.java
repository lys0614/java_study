package chap01;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		// 타입 변환 = 서로 다른 데이터 타입을 연산하기 위해 동일한 데이터 타입으로 변환하는것
		// byte -> int / float -> double / int -> double
		// 자동 타입 변환 : 서로 다른 데이터 타입을 연산 시 더 큰 데이터 타입으로 자동으로 변환하여 연산을 진행하는 것
		double d1 = 5 * 3.14; // int 타입 5와 double타입 3.14를 연산하면 자동 타입 변환이 발생하여 5.0 * 3.14 로 연산됨
		double d2 = 1; // int 타입 1을 double 형 변수 d2에 저장 시 자동으로 1.0이 d2에 저장됨

		// 강제 타입 변환 : 특정한 데이터 타입으로 사용자가 직접 데이터 타입을 변환하는 것
		// 사용법
		// 변환할 데이터 타입 데이터값;
		float f = (float) 3.14; // float형 변수 f에 double형 데이터 3.14를 저장할 수 없으므로 double로 강제 변환 한것
		byte b1 = (byte) 300; // byte형 변수 b 에 int형 데이터 300을 저장할 수 없으므로 강제적으로 byte형으로 변환
		byte x = (byte) 3.14; // byte형 변수에 double형 데이터 3.14를 저장할 수 없으므로 강제적으로 byte형으로 변환
		double dd = (double) 3.14f;
		i = 7 / 4;// 정수끼리의 연산이므로 소수점 자리는 표시안함
		System.out.println(i);
		d = 7 / 4;// 정수끼리의 연산이므로 결과는 1 이지만 double 타입 변수에 저장해서 1.0이 됨
		System.out.println(d);
		d = 7 / (double) 4;// 정수와 실수의 연산이므로 실수와 실수 연산으로 자동변환하고 그 결과값도 실수로 되 1.75가 나옴
		System.out.println(d);
		// i =7/(double)4 를 할 경우 타입 불일치 에러가 발생한다.
		i = 300;//int 타입 변수 i에 값 300 저장
		// 300은 byte 타입의 값 범위 사이에 있지 않으므로 byte형으로 형변환 불가
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("Byte 타입으로 변형할 수 없습니다.");
		} else {
			b = (byte) i;
		}
		System.out.println("----------------------------------");
		int intb = 100;
		double dbb = intb;// 자동 타입 변환
		System.out.println("int 타입 변수 : " + intb);
		System.out.println("dobule타입 변수 : " + dbb);
		intb = (int) 3.14;
		System.out.println(intb); // 3.14의 소숫점 뒤 자리가 제거됨, 강제 타입 변환
		System.out.println("----------------------------------");

	}
}
