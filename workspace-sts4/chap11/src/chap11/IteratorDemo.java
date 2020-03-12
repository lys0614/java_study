package chap11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.*;
public class IteratorDemo {

	public static void main (String[] args) {
		List<String> list = new ArrayList<>();
		list.add("�ٶ���");
		list.add("������");
		list.add("����");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		Collections.sort(list);
		
		while(iterator.hasNext()) {//�̹� �ݺ��� ������ �ݺ����̹Ƿ� �÷����� ���Ҹ� ������ �� ����.
			//���� �ƹ��� ���뵵 ������� �ʴ´�.(�ܼ��� 2��° ���� ������ ����)
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " "); 
		}
		
		
	}
}
