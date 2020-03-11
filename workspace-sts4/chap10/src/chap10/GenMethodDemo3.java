package chap10;

class Ticket implements Comparable{
	int no;
	
	public Ticket(int no) {
		this.no = no;
	}
	
	@Override
	public int compareTo(Object o) {
		Ticket t = (Ticket) o;
		int result = 0;
//		return no<t.no ? -1 : (no > t.no ? 1:0);
		if(no < t.no) {
			result = -1;
		}
		else if(no > t.no) {
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}


}

public class GenMethodDemo3 {

	//Comparable 은 인터페이스 지만 제네릭 형식으로 상속할 경우 extends 키워드를 사용함
	//인터페이스 Comparable 을 상속받은 Ticket 클래스 타입만 제네릭 T로 사용할 수 있음
	public static <T extends Comparable> int countGT(T[] a, T elem) {
		int count = 0;
		for(T e : a) 
			if(e.compareTo(elem)>0) 
				++count;
		return count;
	}
	
	public static void main(String[] args) {
		Ticket[] a = {new Ticket(5), new Ticket(3),new Ticket(10), new Ticket(7), new Ticket(4)};
		System.out.println(countGT(a, a[4]));
	}

}

