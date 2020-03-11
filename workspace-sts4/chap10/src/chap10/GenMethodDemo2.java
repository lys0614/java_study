package chap10;

import chap10.GenMethodDemo1.Utils;

public class GenMethodDemo2 {
	
	static class Utils{
		public static <T extends Number> void showArray(T[] a) {
			//T�� � Ÿ���̵� �� �Ǵµ� Number Ŭ������ ��ӹ޾Ƽ� NumberŬ������ Ư���� ������ �ִ� Ŭ���� Ÿ�Ը� ����Ҽ� �ֵ��� ������ �� ��.
			for(T t : a) System.out.printf("%s ", t);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5};//�⺻ int Ÿ���� ���� Ŭ������ Integer Ŭ���� Ÿ������ �迭�� ���� �� ������ �߰�
		Double[] da = {1.0,2.0,3.0,4.0,5.0};//�⺻ double Ÿ���� ���� Ŭ������ Double Ŭ���� Ÿ������ �迭�� ���� �� ������ �߰�
		Character[] ca = {'h','e','l','l','o'};//�⺻ char Ÿ���� ���� Ŭ������ Character Ŭ���� Ÿ������ �迭�� ���� �� ������ �߰�
		
		Utils.showArray(ia);
		Utils.showArray(da);//da�� ia�� NumberŬ������ Ư���� ������ �ִ� Ŭ���� Ÿ���� ���⶧���� ������ ������ �߻����� �ʴ´�
		//Utils.<Character>showArray(ca); �� Number Ŭ������ �ڽ� Ÿ���� �ƴϱ� ������ ������ ������ �߻��Ѵ�
		
		System.exit(0);
	}

}
