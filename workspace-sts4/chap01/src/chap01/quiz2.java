package chap01;
import java.util.Scanner;
public class quiz2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("--------��1-------");
		System.out.println("     *     ");
		System.out.println("    ***    ");
		System.out.println("   *****   ");
		System.out.println("  *******  ");
		System.out.println(" ********* ");
		System.out.println("***********");
		
		System.out.println("--------��2-------");
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.println(a + "�� ������ : " + a*a);
		
		System.out.println("--------��3-------");
		System.out.print("����� �ظ��� ��������? : ");
		double radius = sc.nextDouble();
		System.out.print("������� ���̴�? : ");
		double height = sc.nextDouble();
		System.out.println("������� ���Ǵ� " + radius*radius*height*3.14);
		
		System.out.println("--------��4-------");
		System.out.print("�ʴ��� ������ �Է��� �ּ��� : " );
		int sec = sc.nextInt();
		System.out.println(sec/3600 + "�ð� " +((sec%3600)/60) + "�� " + sec%60 +"��");
		
		System.out.println("--------��5-------");
		System.out.print("���� �ҹ��� 1���ڸ� �Է� : ");
		String str = sc.next();
		char c = str.charAt(0);
		System.out.printf("%c \n",c-(32));
		
		
		System.out.println("--------��6-------");
		System.out.println("ȭ�� �µ��� �Է��ϼ��� : ");
		double degree = sc.nextDouble();
		double ondo = (double)5/9 * (degree - 32);
		System.out.println("���� �µ� : " + ondo);
		
		System.out.println("--------��7-------");
		System.out.print("������ �Է��ϼ��� : ");
		int q7 = sc.nextInt();
		if(q7 % 4 == 0 && q7 % 5 == 0) {
			System.out.println("4 �� 5�� ��������  "+true);
		}
		else if (q7 %4 !=0 && q7 % 5 != 0) {
			System.out.println("4 �� 5�� ���������� ���� "+false);
		}
		
		if(q7 % 4 == 0 || q7 % 5 == 0) {
			System.out.println("4 Ȥ�� 5�� ������ �� " + true);
		}
		else if(q7 % 4 != 0 || q7 % 5 != 0 ) {
			System.out.println("4 Ȥ�� 5�� ������ ���� ���� " + false);
		}
		if(q7 % 4 == 0 || q7 % 5 ==0) {
			if(q7 % 20 != 0) {
				System.out.println("4 Ȥ�� 5�� ������ ������ �� �� ��ηδ� ������ ���� ���� "+false);
			}
			else if (q7 % 20 == 0) {
				System.out.println("4 Ȥ�� 5�� ������ ���鼭 �� �� ��η� ������ �� " + true);
			}
		}
		
		System.out.println("--------��8-------");
		System.out.print("0~999 �������� ������ �Է��ϼ��� : ");
		int q8 = sc.nextInt();
		if(q8 < 0 || q8 >=1000) {
			System.out.print("�ٽ� �Է��ϼ��� : " );
			q8 = sc.nextInt();
		}
		int q8a = q8/100;
		int q8b = (q8 - (q8a*100))/10;
		int q8c = (q8 - (q8a*100) - (q8b*10));
		System.out.println("�� �ڸ����� �� : " +(q8a+q8b+q8c));
		
		System.out.println("--------��9-------");
		// 140�� ��������
		System.out.print("���� ������ �Է��ϼ��� : ");
		int point1 = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int point2 = sc.nextInt();
		System.out.print("�Ϲ� ������ �Է��ϼ��� : ");
		int point3 = sc.nextInt();
		
		if(point1 >= 70) {//���������� 70�� �̻� �̾�� �ϸ�(and)
			
			if(point2 >= 30 && point3 >= 30) {//���� �Ϲ��� ���� 30�� �̻� �̰ų�(or) ������ 80�� �̻��̾�� ��
				System.out.println("���� ����");
			}
			else if(point2+point3 >= 80) {
				System.out.println("���� ����");
			}
			else {
				System.out.println("���� �Ұ�");
			}
		
		}
		else {
			System.out.println("���� �Ұ�");
		}
		
		
		
		
	}
}
