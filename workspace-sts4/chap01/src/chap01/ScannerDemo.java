package chap01;
import java.util.Scanner;
// import : �̹� ������� �ִ� �ڹ��� ���� Ŭ������ �ٸ� ����� �������� Ŭ������ ������ ���Ϸ� �ε��ؼ� ����ϴ� ��
public class ScannerDemo {

	public static void main(String[] args) {
		
		//Scanner Ŭ������ ��ü�� �����Ͽ� ���
		// new : Ŭ������ ����ü�� ��ü�� �����ϴ� ��ɾ�
		
		Scanner in = new Scanner(System.in);
		System.out.println("ù ���� �Է� : ");		
		int x = in.nextInt();
		System.out.println("�ι��� ���� �Է� : ");
		int y = in.nextInt();
		//����Ҷ� ����� �������� ������ ���� �������ټ� �ִ� printf
		System.out.printf("%d * %d �� %d �Դϴ� \n", x, y, x*y);
		System.out.println(x + " �� " + y +" �� ���� " + x*y + "�Դϴ�");
		
		//Scanner Ŭ������ �����ϴ� ������ Ÿ�� �޼���
		// next() : ���ڿ��� �Է¹���
		// nextByte() : Byte Ÿ���� �����͸� �Է¹���
		// nextShort() : short Ÿ���� �����͸� �Է� ����
		// nextInt() : int Ÿ���� �����͸� �Է� ����
		// nextLong() : LongŸ���� �����͸� �Է� ����
		// nextFloat() : float Ÿ���� �����͸� �Է� ����
		// nextDouble() : double Ÿ���� �����͸� �Է¹���
		// nextLine() : ���ڿ��� �Է¹���
		
		System.out.print("�̸��� �Է��ϼ���");
		String name = in.next();
		System.out.println("�̸� : " + name);
	}

}
