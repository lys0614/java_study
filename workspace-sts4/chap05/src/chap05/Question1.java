package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//�л� �� �� ������ �Է��ϸ� �� �л��� ������ �߷��ϴ� ���α׷��� �ۼ��� ����
		int NumOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��Ͻÿ� : ");
		NumOfStudents = in.nextInt();
		scores = new int[NumOfStudents];
		
		for(int i=0; i<NumOfStudents;i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			int grade = in.nextInt();
			scores[i] += grade;
		}
		System.out.println(NumOfStudents+"���� �л��� ������ ������ �����ϴ�");
//		for(int i=0; i<NumOfStudents; i++) {
//			System.out.print(scores[i]+" ");
//		}
		for(int i:scores) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println(i+"�� �л��� ������ A �Դϴ�");
			}
			else if(scores[i] >= 80) {
				System.out.println(i+"�� �л��� ������ B �Դϴ�");
			}
			else if(scores[i]>= 70) {
				System.out.println(i+"�� �л��� ������ C �Դϴ�");
			}
			else if(scores[i] >= 60) {
				System.out.println(i+"�� �л��� ������ D �Դϴ�");
			}
			else if(scores[i]< 60 && scores[i]>0) {
				System.out.println(i+"�� �л��� ������ F �Դϴ�");
			}
			else if(scores[i]<0) {
				System.out.println("�߸� �Է��Ͽ����ϴ�");
			}
		}
		
		
		
	}
	
}
