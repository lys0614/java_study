package chap11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<>();
		
		s1.add("�ٳ���"); s1.add("���"); s1.add("��");
		
		System.out.println(s1.peek());
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println();
		
		Stack<Integer> s2 = new Stack<>();
		s2.add(100);
		s2.add(50);
		s2.add(25);
		s2.add(1, 10);//s2�� 1���ε����� 10 ����
		for(int value : s2) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		while(!s2.empty()) {
			System.out.print(s2.pop() + " ");
		}

	}

}
