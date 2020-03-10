package chap09;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("hi");
		System.out.println(s.hashCode());//���ڿ� ���� s�� �ؽ��ڵ� ���
		s = s+"!";
		System.out.println(s.hashCode());//����� ���ڿ� s�� �ؽ��ڵ� ���, �ؽ��ڵ嵵 �����
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());//StringBuilderŸ���� ���ڿ� sb�� �ؽ��ڵ� ���
		sb = sb.append("!");
		System.out.println(sb.hashCode());//���ڿ��� ����� sb�� �ؽ��ڵ� ���, �ؽ��ڵ尡 �״����
		
		System.out.println(sb.replace(0, 2, "goodbye").insert(0, "java"));
	}

}
