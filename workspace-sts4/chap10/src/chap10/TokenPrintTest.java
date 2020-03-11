package chap10;

import java.util.*;

public class TokenPrintTest {

	public static void main(String[] args) {
		String s= "of the people, by the people, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s, " ,");

		
		while(true) {
			//while(true)는 무한 루프 돎
			//st가 갖고있는 토큰의 갯수는 한정되어있는데 while문에 무한으로 돌아버리니 원소가 없다는 예외사항을 출력하며 프로그램을 종료시킴
			try {
			token = st.nextToken();
			System.out.println(token);
			}
			catch(NoSuchElementException e) {
				break;
			}
		}
	}

}
