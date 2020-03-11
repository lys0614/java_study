package chap10;

public class GenMethodDemo1 {
	//내부클래스 사용
	static class Utils{
		public static <T> void showArray(T[] a) {
			for(T t : a) System.out.printf("%s ", t);//배열에서 받아온걸 문자형태로 출력함(%s)
			System.out.println();
		}
		
		public static <T> T getLast(T[] a) {
			return a[a.length-1];
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5};//기본 int 타입의 래퍼 클래스인 Integer 클래스 타입으로 배열을 선언 및 데이터 추가
		Character[] ca = {'h','e','l','l','o'};//기본 char 타입의 래퍼 클래스인 Character 클래스 타입으로 배열을 선언 및 데이터 추가
		
		Utils.showArray(ia);
		Utils.<Character>showArray(ca);
		
		System.out.println(Utils.getLast(ia));
	}

}
