package chap01;
import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		
		int $value = 1;
		int _name = 1;
		int doublePlus = 1;
		double w, h, area;
		Scanner in = new Scanner(System.in);
		System.out.print("�ʺ� �Է� : ");
		w = in.nextDouble();
		System.out.print("���� �Է� : ");
		h = in.nextDouble();
		System.out.println("���̴� : "+ w*h);
		
		System.out.print("Ȧ¦ ������ ���� �Է� : \n");
		int i = in.nextInt();
		
		if(i % 2 != 0) {
			System.out.println("Ȧ����");
		}
		else {
			System.out.println("¦����");
		}
		
		int i1 = 0x11, i2 = 5;
		final int ONE = 1;
		char c1 = 'a';
		float f1 = 1.5f;
		double d1 = 2.8;
		boolean b1 = true;
		System.out.printf("i1 = %d\n", i1);
		System.out.printf("i1/2 = %d\n", i1/2);
		System.out.println("c1 + ONE = " + c1+ONE);
		System.out.println("(int)c1 + ONE = " + (int)c1+ONE);
		System.out.printf("(c1 + ONE) = %d\n", c1+ONE);
		System.out.printf("(c1 + ONE) = %c\n", c1+ONE);
		System.out.printf("i2 + f1 = %f\n", i2 + f1);
		System.out.printf("f1 + d1 = %.1f\n",f1 + d1);
		System.out.printf("");
		
	}
}
