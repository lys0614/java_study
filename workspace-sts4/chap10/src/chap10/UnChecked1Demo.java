package chap10;

import java.util.StringTokenizer;

public class UnChecked1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "+");
		}
		System.out.print(st.nextToken());//가져올 토큰이 없어 예외 발생
		System.exit(0);
	}

}
