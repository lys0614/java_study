package chap03;

import java.util.Scanner;

public class SimpleIfDemo {
	// SimpleIfDemo Ŭ������ �ʵ忡 Scanner Ÿ���� sc �Ӽ��� �����ؼ� void�� ������ �ʰ� �������� ����� �� �ְ� ��.
	static Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		//���
		//�ڹ� ���α׷����� ���ǿ� ���� ���α׷��� �帧�� �����ϴ� ����
		//�ڹٽ�ũ��Ʈ�� ����� ������
		// if, if ~ else, else if, switch ~ case
		
		//�ܼ� if��
		System.out.println("-------�ܼ� if ��---------");
		
		System.out.print("�ƹ� ���� �Է� �ϼ� : " );
		int num = sc.nextInt();
		
		if( num % 2 == 0 ) {
			System.out.println("¦��");
			}
		if( num % 2 != 0 ) {
			System.out.println("Ȧ��");
			}
		System.out.println("����");
		
		System.out.println("-------if ~ else ��---------");
		//if ~ else ��
		// ���ǿ� ���� true�϶��� false�϶� �����ϴ� ���๮�� �޶����� ���ǹ�
		// ������ ���� �ϳ��� ���� �ؾ� �Ҷ� ����ϴ� ����
		
		System.out.print("�ƹ� ���ڳ� �Է��ϼ� : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}		
		//���� ������ ����
		System.out.println((num2 % 2 == 0)? "¦��":"Ȧ��");
		System.out.println("����");
		
		System.out.println("------- else if �� ---------");

		//else if ��
		// �ϳ��� if ���� �������� ������ ���� ��� ���
		// ������ else ���� �ʿ� �� ���� ��� ���� �ص� ��
		String grade = "";
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if(score >= 90) {grade = "A";}
		else if (score >= 80) {grade = "B";}
		else if (score >= 70) {grade = "C";}
		else if (score >= 60) {grade = "D";}
		else {grade = "F";}
		System.out.println("�� ������ : "+grade);
		
		System.out.println("------- ��ø if �� ---------");
		//��ø if ��
		// if�� ���ο� if���� ����ϴ� ���
		// if��, if ~ else ��, else if���� �Ǵٸ� if���� ����ϴ� ���.
		
		String grade2 = "";
		System.out.print("������ �Է��ϼ��� : ");
		int score2 = sc.nextInt();
		
//		if (score2 >= 90) {
//			grade2 ="A";
//		}
//		else {
//			if(score2 >= 80) {
//				grade2 = "B";
//			}else {
//				if(score2 >= 70) {
//					grade2 = "C";
//				}else {
//					if(score2 >= 60) {
//						grade2 = "D";
//					}else {
//						grade2 = "F";
//					}
//				}
//			}
//		}
		//��øif�� ����ؼ� ���α׷� �����
				
			if(score2 >= 60) {
				grade2 = "D";
					if(score2 >= 70) {
						grade2 = "C";
						if(score2 >= 80) {
							grade2 = "B";
							if(score2 >= 90) {
								grade2 ="A";								
							}
						}
					}
				}
			else {
				grade2 = "F";
			}
		
		System.out.println("�� ������ : "+grade2);
		
		System.out.println("------- switch ~ case �� ---------");
		//switch �� �ڹٽ�ũ��Ʈ�� switch ~ case ���� ������
		//switch �� ���ǹ��� ������� case���� ã�Ƽ� �����ϴ� �����̴�.
		//case�� ������� ���� ��� default�� ����������, default���� �ݵ�� �ʿ��Ѱ��� �ƴ�. else if ���� else�� ���� �ƶ�.
		//break : ���α׷� ���� �� break���� ���� �� �ش� ���ǹ� or �ݺ����� ��� ������.
		//switch~case ������ break ���� �Է����� ������ switch ���� �ڵ���� ������ ���� ��� ������ = ���ǹ� Ȱ���� �������� �ϴµ� ������ �̷������ ����.
		System.out.print("��� �Է��ϼ� : ");
		int rank = sc.nextInt();
		
		switch(rank) {
		case 1 : System.out.println("1�� ���� \n"); break;
		case 2 : System.out.println("2�� �� \n"); break;
		case 3 : System.out.println("3�� �� \n"); break;
		case 4 : System.out.println("4�� ������ \n"); break;
		default : System.out.println("������ ���� ���� \n");
		}
		
		
		int num3 = 3;
		
		switch (num = 3) {// break ���� ������ case3���� case1���� ���� ������.
		case 4 : System.out.print("*");
		case 3 : System.out.print("*");
		case 2 : System.out.print("*");
		case 1 : System.out.print("*");
		}
		
		
		
		
		
		
		
		
		
		System.exit(0);//���α׷� ������Ѽ� ������ ������ ���ִ� ����
	}//main �޼��� �ݴ� ��ȣ

}//SimpleIfDemo Ŭ���� �ݴ� ��ȣ
