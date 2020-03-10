package chap09;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java = "java";
		int version = 8;
		
		String s= MessageFormat.format("language : {1}\nversion : {0}", version,java);
		//System.out.printf()의 방식처럼 활용하는 것.
		//"" 안에 문자열 배치가 끝나고 , 뒤에 위치한 것들은 배열의 인덱스 번호에 의거해서 순서번호가 정해진다고 생각하면 됨.
		//즉 {1}이 제일먼저 나와있다고 해서 version이 들어가는게 아닌 인덱스번호 1번에 위치한 java가 들어가는 방식.
		System.out.println(s);
		
		Object[] data = {java, version};
		
		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");
		
		System.out.println(f.format(data));
		
		System.exit(0);
		
		
	}

}
