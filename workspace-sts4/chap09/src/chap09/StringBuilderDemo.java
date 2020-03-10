package chap09;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("hi");
		System.out.println(s.hashCode());//문자열 변수 s의 해쉬코드 출력
		s = s+"!";
		System.out.println(s.hashCode());//변경된 문자열 s의 해쉬코드 출력, 해시코드도 변경됨
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());//StringBuilder타입의 문자열 sb의 해시코드 출력
		sb = sb.append("!");
		System.out.println(sb.hashCode());//문자열이 변경된 sb의 해시코드 출력, 해시코드가 그대로임
		
		System.out.println(sb.replace(0, 2, "goodbye").insert(0, "java"));
	}

}
