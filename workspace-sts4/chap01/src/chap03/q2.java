package chap03;
import java.util.Scanner;
public class q2 {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("------------------��1---------------------");
		int age;
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = in.nextInt();
		if(age >= 19) {
			System.out.println("����");
		}
		else if(age < 19) {
			System.out.println("�̼���");
		}
		System.out.println("------------------��2-----------------------");
		System.out.print("������ �Է��Ͻÿ� : ");
		int rank = in.nextInt();
		switch(rank) {
		case 1 : System.out.println("���� ���߽��ϴ�"); break;
		case 2 : System.out.println("���߽��ϴ�"); break;
		case 3 : System.out.println("���߽��ϴ�"); break;
		case 4 : System.out.println("�����Դϴ�"); break;
		case 5 : System.out.println("�����Դϴ�"); break;
		case 6 : System.out.println("�����Դϴ�"); break;
		default : System.out.println("����ؾ� �ڽ��ϴ�"); break;
		}
		System.out.println("------------------��3-----------------------");
		System.out.print("���� ������ �Է��ϼ��� : ");
		int sum = in.nextInt();
		int res = 0;
		do {
			res+=sum;
			System.out.print("���� ������ �Է��ϼ��� : ");
			sum = in.nextInt();
		}
		while(sum > 0);
		System.out.println("�Է��� ���� �������� �� : "+res);
		System.out.println("------------------��4-----------------------");
		String q4 = "";
		for(int i=1; i<=5; i++) {
			q4+="*";
			System.out.println(q4);
		}
		
		System.out.println("------------------��5-----------------------");
		int a,b,c;
		for(c=1;c<100;c++) {
			for(b=1;b<100;b++) {
				for(a=1;a<100;a++) {
					
				}
			}
		}
		System.out.println("------------------��6-----------------------");
		//���� s ���� r �� p
		System.out.println("���� s ���� r �� p");
		System.out.print("���� ���������� �ϴµ� �� �� �Է��ϼ� : ");
		String cheolsu = in.next();
		System.out.print("���� ���������� �ϴµ� �� �� �Է��ϼ� : ");
		String yeonghui = in.next();
		whoswin(cheolsu, yeonghui);
		if(cheolsu.equals("s")) {
			if(yeonghui.equals("s")) {
				System.out.println("���");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("��");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("�̱�");
			}
		}
		if(cheolsu.equals("r")) {
			if(yeonghui.equals("s")) {
				System.out.println("�̱�");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("���");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("��");
			}
		}
		if(cheolsu.equals("p")) {
			if(yeonghui.equals("s")) {
				System.out.println("��");
			}
			else if(yeonghui.equals("r")) {
				System.out.println("�̱�");
			}
			else if(yeonghui.equals("p")) {
				System.out.println("���");
			}
		}
		System.out.println("------------------��7 - 6-----------------------");
		//���� s ���� r �� p
		String c1 = input("ö��");
		String y1 = input("����");
		whoswin(c1, y1);

		
		System.exit(0);
	}
	
	public static String input(String a) {
		
		return "";
	}

	public static String whoswin(String a, String b) {
		
		return "";
	}

}
