package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		String[] name1 = {"�罿","ȣ��","�ٴ�ǥ��","��"}; // ���ڿ� �迭 ���� �� ������ �߰�

		List<String> list = Arrays.asList(name1);//�迭�� ����ƮŸ������ ��ȯ �� ����
		list.set(1, "�޹���");//set()�� ����Ͽ� ������ ����
		
		//ȭ�鿡 ����Ʈ ���
		for(String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();

		//����Ʈ ������ ����
		list.sort((x,y) -> x.length() - y.length());
		
		//����Ʈ�� �迭�� ��ȯ
		//����Ʈ�� ũ�Ⱑ �������̱� ������ �迭�� ��ȯ �� ���ο� �迭�� �����Ͽ� �����ؾ���
		String[] name2 = list.toArray(new String[list.size()]);
		for(int i=0; i<name2.length;i++) {
			System.out.print(name2[i]+"\t");
		}
		
		System.out.println("\n-------------------");
		
		List<String> list2 = new ArrayList<String>();
		System.out.println(list2.size());
		
		list2.add("��");
		list2.add("��");
		list2.add("��");
		System.out.println(list2.size());
		
		for(int i=0;i<list2.size();i++) {
			System.out.print(list2.get(i)+ " ");//list2�� i�� �ε��� �����͸� ���
		}
		System.out.println();
		
		list2.remove(0);
		
		for(String s : list2) {
			System.out.print(s + " ");
		}
		
		list2.set(0, "��");
		System.out.println();
		for(String s : list2) {
			System.out.print(s + " ");
		}
	}

}
