package chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>(); // integer Ÿ���� ArrayList ��ü�� �����Ѵ�
		//ArrayList<> ���� ()�� �����ڸ� ������״ٴ� ǥ���̴�.
		int data;
		int sum = 0;
		
		while((data = in.nextInt()) > 0)//Ű���忡�� �ԷµȰ��� ������ �ƴҶ����� �ݺ�
			scores.add(data);//�����͸� ���� �迭�� �߰�
		
		for(int i=0; i < scores.size(); i++) {
			sum += scores.get(i);//���� �迭�� i��° ���Ҹ� �����ͼ� ���� sum�� ����
		}
		System.out.println("��� = "+sum / scores.size());
		System.out.println(scores);

		ArrayList<String> test = new ArrayList<>();
		System.out.println(test.size());
		test.add("ArrayList��");
		System.out.println(test.size());
		test.add("�迭�� ���������");
		System.out.println(test.size());
		test.add("ũ�Ⱑ ��������");
		System.out.println(test.size());
		test.add("������ ������");
		System.out.println(test.size());
	
		String arrStr[] = new String[5];
		System.out.println(arrStr.length);
		arrStr[0]="�迭��";
		System.out.println(arrStr.length);
		arrStr[1]="ArrayList�� ���������";
		System.out.println(arrStr.length);
		arrStr[2]="ũ�Ⱑ";
		System.out.println(arrStr.length);
		arrStr[3]="�����Ǿ�";
		System.out.println(arrStr.length);
		arrStr[4]="����";
		System.out.println(arrStr.length);
	}

	
}
