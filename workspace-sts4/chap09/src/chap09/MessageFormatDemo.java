package chap09;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String java = "java";
		int version = 8;
		
		String s= MessageFormat.format("language : {1}\nversion : {0}", version,java);
		//System.out.printf()�� ���ó�� Ȱ���ϴ� ��.
		//"" �ȿ� ���ڿ� ��ġ�� ������ , �ڿ� ��ġ�� �͵��� �迭�� �ε��� ��ȣ�� �ǰ��ؼ� ������ȣ�� �������ٰ� �����ϸ� ��.
		//�� {1}�� ���ϸ��� �����ִٰ� �ؼ� version�� ���°� �ƴ� �ε�����ȣ 1���� ��ġ�� java�� ���� ���.
		System.out.println(s);
		
		Object[] data = {java, version};
		
		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");
		
		System.out.println(f.format(data));
		
		System.exit(0);
		
		
	}

}
