package chap11;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Key, Value>������ = new HashMap<key, value>()���·� ���� �� ���
		//HashMap�� ������ ��� ����.
		Map<Element, Integer> map = new HashMap<>();
		map.put(new Element("�ȳ�"), 1);//������ ������ �ٸ� ��ü�� HashMap�� �߰��� �� ũ�⸦ �����Ѵ�.
		map.put(new Element("�ȳ�"), 2);
		map.put(null, 3);//null�� Ű�� ��� ����
		System.out.println(map.size());
		System.out.println(map);
		
	}

}

