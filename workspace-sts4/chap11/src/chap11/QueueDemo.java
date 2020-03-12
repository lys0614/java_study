package chap11;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.poll());//poll�� ������, ���Ұ� ������ null�� ��ȯ��
		q.offer("���");
		System.out.println("�ٳ����� �߰��߳��� " + q.offer("�ٳ���"));
		
		try {
			q.add("ü��");//queue�� ũ�⸦ �ʰ��ؼ� �߰��Ϸ��ϸ� ���ܰ� �߻��Ѵ�.
		}catch(IllegalStateException e) {
			
		}
		System.out.println("��� ������ : "+q.peek());
		
		String head = null;
		
		try {
			head = q.remove();
			System.out.println(head + " �����ϱ�");
			System.out.println("���ο� ��� : "+ q.element());
		}catch(NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "�����ϱ�");
		System.out.println("���ο� ��� : "+q.element());
		
		System.out.println("ü���� �����ϳ� : "+q.contains("ü��"));
		System.out.println("����� �����ϳ� : "+q.contains("���"));
		
	}

}
