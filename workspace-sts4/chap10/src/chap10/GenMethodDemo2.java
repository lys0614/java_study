package chap10;

import chap10.GenMethodDemo1.Utils;

public class GenMethodDemo2 {
	
	static class Utils{
		public static <T extends Number> void showArray(T[] a) {
			//T는 어떤 타입이든 다 되는데 Number 클래스를 상속받아서 Number클래스의 특성을 가지고 있는 클래스 타입만 사용할수 있도록 제한을 건 것.
			for(T t : a) System.out.printf("%s ", t);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5};//기본 int 타입의 래퍼 클래스인 Integer 클래스 타입으로 배열을 선언 및 데이터 추가
		Double[] da = {1.0,2.0,3.0,4.0,5.0};//기본 double 타입의 래퍼 클래스인 Double 클래스 타입으로 배열을 선언 및 데이터 추가
		Character[] ca = {'h','e','l','l','o'};//기본 char 타입의 래퍼 클래스인 Character 클래스 타입으로 배열을 선언 및 데이터 추가
		
		Utils.showArray(ia);
		Utils.showArray(da);//da와 ia는 Number클래스의 특성을 가지고 있는 클래스 타입을 쓰기때문에 컴파일 오류가 발생하지 않는다
		//Utils.<Character>showArray(ca); 은 Number 클래스의 자식 타입이 아니기 때문에 컴파일 오류가 발생한다
		
		System.exit(0);
	}

}
