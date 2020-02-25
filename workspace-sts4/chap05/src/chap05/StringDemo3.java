package chap05;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = new String("HI.");
		String s2 = new String(" jAvA");
		String s3, s4;
		
		System.out.println("문자열 길이(s1) : "+s1.length());
		char c = s1.charAt(1);
		System.out.println(c);
		
		s1=s1.concat(s2);// = s1 = s1 + s2; 혹은 s1 += s2;
		s3=s1.toLowerCase();
		s4=s1.substring(4,8);
		
		System.out.println(s1 + "!");
		System.out.println(s3+"!");
		System.out.println(s4+"!");
		
	}
}
