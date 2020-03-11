package chap10;

public class EntryDemo {

	public static void main(String[] args) {
	Entry<String, Integer> e1 = new Entry<>("�輱��", 20);
	Entry<String, String> e2 = new Entry<>("��Ÿ","���");
	
	//Entry<int, String> e3 = new Entry<>(30, "�ƹ���");
	//���׸��� Ÿ�� ���� �� Ŭ���� Ÿ�Ը� ����� �� ����.
	//�⺻ Ÿ���� �Ű� ������ Ÿ������ ����� �� ����.
	System.out.println(e1.getKey()+" "+ e1.getValue());
	System.out.println(e2.getKey()+" "+ e2.getValue());
	}
}

//���׸� Ŭ����, 2���� �����͸� �ްڴٰ� ����
class Entry<K, V>{
	private K key;//������� 2�� ����
	private V value;
	
	//�Ű����� 2���޴� ������ ����
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
