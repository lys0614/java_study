package chap06;
//import java.util.*; = java.util ��Ű���� �ִ� ��� Ŭ������ ȣ����.
import java.util.Scanner;//java.util.Scanner Ŭ���� �� ȣ����.
import yolo.Cal.*;

public class ImportDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//import �� ���� ������
		//java.util.Scanner in = new java.util.Scanner(System.in); ���� �����
		//import ���� ����ؼ� �ڵ��� ���̸� ����Ų��
		System.out.print("�̸� �Է� : ");
		String name = in.next();
		System.out.println(name);
		//�̰͵� java.lang.System.out.print(""); �ؾ���
		//�ٵ� java.lang ��Ű���� �⺻ ��Ű������ ���� import�������ʾƵ� ������� ������
		
		Cal cal1 = new Cal();
		//���� ��Ű�� ���� �ִ� Cal Ŭ������ Cal()�޼��� ����
		cal1.output();
		
		yolo.Cal cal2 = new yolo.Cal();
		//�ٸ� ��Ű��(yolo)�� �ִ� CalŬ������ Cal()�޼��� ����
		cal2.output();
	}
	
}
