package chap10;

import java.util.*;

public class TokenPrintTest {

	public static void main(String[] args) {
		String s= "of the people, by the people, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s, " ,");

		
		while(true) {
			//while(true)�� ���� ���� ��
			//st�� �����ִ� ��ū�� ������ �����Ǿ��ִµ� while���� �������� ���ƹ����� ���Ұ� ���ٴ� ���ܻ����� ����ϸ� ���α׷��� �����Ŵ
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
