package chap10;

public class EntryDemo {

	public static void main(String[] args) {
	Entry<String, Integer> e1 = new Entry<>("김선달", 20);
	Entry<String, String> e2 = new Entry<>("기타","등등");
	
	//Entry<int, String> e3 = new Entry<>(30, "아무개");
	//제네릭은 타입 설정 시 클래스 타입만 사용할 수 있음.
	//기본 타입을 매개 변수의 타입으로 사용할 수 없음.
	System.out.println(e1.getKey()+" "+ e1.getValue());
	System.out.println(e2.getKey()+" "+ e2.getValue());
	}
}

//제네릭 클래스, 2개의 데이터를 받겠다고 선언
class Entry<K, V>{
	private K key;//멤버변수 2개 선언
	private V value;
	
	//매개변수 2개받는 생성자 선언
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}
