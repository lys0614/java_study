package chap09;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer bi1 = new Integer(10);//Integer타입 객체 생성
		
		int i1 = bi1.intValue();//Integer타입을 int타입으로 변환
		System.out.println(i1);
		
		double d = bi1.doubleValue();//Integer타입을 double 타입으로 변환
		System.out.println(d);
		
		Integer bi2 = 20;//자동 박싱
		System.out.println(bi2);
		
		int i2 = bi2+20;//자동 언박싱
		System.out.println(i2);
		
		String s1 = Double.toString(3.14);//double타입 데이터를 String타입으로 변환
		System.out.println(s1);
		
		Double pi = Double.parseDouble("3.14");//String타입을 Double타입으로 변환
		System.out.println(pi);
		
		Integer bi3 = Integer.valueOf("11", 16); // 16진수 숫자 문자열을 10진수 integer타입으로 변환
		System.out.println(bi3);
	}

}
