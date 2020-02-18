package chap01;
import java.util.Scanner;
public class ArtihmeticDemo {
	public static void main(String[] args) {
		//������
		//�ڹٽ�ũ��Ʈ�� �����ڿ� ������
		
		//��� ������ : +,-,*,/,% ��Ģ������
		//���� ������ : =, +=, -=, *=, /=, %=, ���� �켱������ ���� ����
		//�� ������ : >, >=, <, <=, ==, !=, instanceof, ������ ���� ���ϴ� ������.
			// instanceof�� Ŭ������ ����ü�� ��ü�� �ش� Ŭ������ ���ϱ����� ������, �� ��ȯ�� �������� Ȯ���Ҷ� ����Ѵ�
		String str = new String();
		StringBuilder sb = new StringBuilder();
		//instanceof �����ڴ� �Ϻη� false�� ������ ������ �Է������� sts �ý��������� ������ �ٷ� ����ϱ� ������
		//���Ƿ� false�� �� �� ����.
		if(str instanceof String) {
			System.out.println("��ü str�� String Ŭ������ ��ü�̴� ");
		}
		else {
			System.out.println("��ü str�� String Ŭ������ ��ü�� �ƴϴ� ");
		}
		
		if(sb instanceof StringBuilder) {
			System.out.println("��ü sb�� StringBuilder Ŭ������ ��ü�̴� ");
		}
		else {
			System.out.println("��ü sb�� StringBuilder Ŭ������ ��ü�� �ƴϴ� ");
		}
		System.out.println("-------------------------------------------------------------------");
		
		//��Ʈ ������
			// &, |, ~, ^ �� ��Ʈ ������ ���� ������. IoT, �Ӻ���� ���� �ַ� Ȱ����
		//�� ������
			// &&, ||, ~(not ������) - �� ������ ���� ������, if������ ������ 2�� �̻� ����ϰ��� �Ҷ� ��
		System.out.println("-------��� ���� ����-------");
		int remainder = 25*2;
		System.out.println("25 / 2 �� �������� : " + remainder + "�̴�");
		
		System.out.println("-------�񱳳� ���� ����---------");
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));//||������ (or������)�� ù ���� true �� �߸� ������ ���� ����� �������� �ʴ´�.
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x<1) | (y-- <1));// | �����ڴ� ù �׿��� true �� ���� ������ ����� �����Ѵ�. �׷��� y-- < 1 �� false�� ���� �ǰ� y--�� �����Ѵ�. 
		//���� y ���� ��������ν� y=0 �� ��µȴ�.
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("---��Ʈ������---");
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte)~0b00000001);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);
		
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);
		System.out.println("---���Կ�����---");
		
		int value = 1;
		value += 1;
		System.out.println("�� = "+value);
		value -= 1;
		System.out.println("�� = "+value);
		value %= 3;
		System.out.println("�� = "+value);
		//���� ������ : ++,--, ���� �����ڶ�� ��. �ش� ���� ���� 1 ������Ŵ, ���� �켱������ ���� ����. �տ� ������ ���� �ϱ� ���� �����ϰ� �����ϰ�, �ڿ� ������ ������ ������ ������
		//�� ���ο��� ���׿����ڰ� �ܵ����� ���� ��� �ǿ����ڰ� �տ��ְų� �ڿ��ְų� �������
		System.out.println("---����������---");
		int data = 1;
		data++;
		System.out.println("data++ �� " + data);
		
		int data2 = 10;
		System.out.println("++�������� ������ ��� �� data2�� �� : "+ ++data2);
		System.out.println("��������++ ������ ��� �� data2�� �� : "+ data2++);
		System.out.println("���� data2�� : "+data2);
		System.out.println("--�������� ������ ��� �� data2�� �� : "+ --data2);
		System.out.println("��������-- ������ ��� �� data2�� �� : "+ data2--);
		System.out.println("���� data2�� : "+data2);
	}
}
