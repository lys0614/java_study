package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		//�ڹ��� �迭�� ������ �� ũ�⸦ ������
		//�ڹ��� �迭�� ũ�⸦ �ø��ų� ���� �� ����
		int scores[] = new int[5]; //int Ÿ���� �� �迭 ����
//		int[] scores1 = new int[5]; �̷��� �ص� ��.
		int sum = 0;
		
		for(int i=0; i<scores.length;i++) {
			scores[i] = in.nextInt();
		}
		for(int i=0; i<scores.length;i++) {
			sum +=scores[i];
		}
		
		System.out.println("��� : "+sum/5.0);
	}

}
