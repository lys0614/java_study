package chap05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hi java";
		String s2 = "hi java";
		String s3 = new String("hi java");
		String s4 = new String("hi java");
		
		//���ڿ����� == �񱳿����ڴ� ���ڿ� ��ü�� �񱳿����� �ϴ°� �ƴϰ� ��ü�� ���������� ���ϴ� ������ �Ѵ�.
		//���� ���ڿ� ��ü�� ���Ϸ��� String Ŭ�������� �����ϴ� equals �޼��带 �̿��ؼ� Ȯ���ؾ���
		//������ �� ���ڿ� ������.equals(���� ���ڿ� ������)
		//�ݵ�� Stirng������ �񱳿����� ���� �ִ�.
		System.out.println("s1 == s2 : "+(s1 == s2));
		System.out.println("s1 == s3 : "+(s1 == s3));
		System.out.println("s3 == s4 : "+(s3 == s4));
		System.out.println("s1 ���ڿ� �� s3 : "+s1.equals(s3));
		s1 = s3;
		System.out.println("s1 = s3 ��� ����");
		System.out.println("s1 == s3 : "+(s1 == s3));
		
	}
}
