package chap09;

import java.util.Arrays;//java.lang ��Ű���� �մ°� �ƴϾ import���� ����������

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a1 = {'j','a','v','a'};
		char[] a2 = Arrays.copyOf(a1, a1.length);//�迭 ����
		System.out.println(a2);
		
		String[] sa = {"����ũ","����","����","�ٳ���","����"};
		print(sa);
		
		Arrays.sort(sa);//�迭���ҵ� �����ϴ� Ű����
		print(sa);
		
		System.out.println(Arrays.binarySearch(sa,"����")); // �迭 ��ġ�� Ž����
		
		Arrays.fill(sa, 2,4,"��Ÿ"); // �迭�� �ε��� 2������ 4-1������ ���Ҹ� ��Ÿ ���ڿ��� ä���
		print(sa);
	}
	
	static void print(Object[] oa) {
		for(Object o : oa) {
			System.out.print(o+" ");
		}
		System.out.println();
	}

}
