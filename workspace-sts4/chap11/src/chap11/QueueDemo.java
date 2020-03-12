package chap11;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.poll());//poll로 제거함, 원소가 없으면 null을 반환함
		q.offer("사과");
		System.out.println("바나나를 추가했나요 " + q.offer("바나나"));
		
		try {
			q.add("체리");//queue의 크기를 초과해서 추가하려하면 예외가 발생한다.
		}catch(IllegalStateException e) {
			
		}
		System.out.println("헤드 엿보기 : "+q.peek());
		
		String head = null;
		
		try {
			head = q.remove();
			System.out.println(head + " 제거하기");
			System.out.println("새로운 헤드 : "+ q.element());
		}catch(NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "제거하기");
		System.out.println("새로운 헤드 : "+q.element());
		
		System.out.println("체리를 포함하나 : "+q.contains("체리"));
		System.out.println("사과를 포함하나 : "+q.contains("사과"));
		
	}

}
