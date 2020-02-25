package chap05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hi java";
		String s2 = "hi java";
		String s3 = new String("hi java");
		String s4 = new String("hi java");
		
		//문자열에서 == 비교연산자는 문자열 자체의 비교연산을 하는게 아니고 객체가 같은것인지 비교하는 연산을 한다.
		//실제 문자열 자체를 비교하려면 String 클래스에서 제공하는 equals 메서드를 이용해서 확인해야함
		//기준이 될 문자열 변수명.equals(비교할 문자열 변수명)
		//반드시 Stirng끼리의 비교에서만 쓸수 있다.
		System.out.println("s1 == s2 : "+(s1 == s2));
		System.out.println("s1 == s3 : "+(s1 == s3));
		System.out.println("s3 == s4 : "+(s3 == s4));
		System.out.println("s1 문자열 비교 s3 : "+s1.equals(s3));
		s1 = s3;
		System.out.println("s1 = s3 명령 이후");
		System.out.println("s1 == s3 : "+(s1 == s3));
		
	}
}
