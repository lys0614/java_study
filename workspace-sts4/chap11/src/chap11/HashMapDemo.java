package chap11;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap ����
		Map<String, Integer> m = new HashMap<>();
		
		m.put("���", 5);//������ ����
		m.put("�ٳ���", 3);
		m.put("����", 1);
		m.put("����", 10);

		System.out.println(m.size()+"������ ������ �ִ�");
		
		for(String key : m.keySet())
			//get(key)�޼��带 ���ؼ� Map��ü�� ������ �ִ� �����͸� �ҷ���
			System.out.println(key + "�� " + m.get(key) + "�� �ִ�");
		
		String key = "�ٳ���";
		//�ش� map ��ü�� ������ Ű�� �����ϴ��� Ȯ��
		if(m.containsKey(key))
			System.out.println(key + "�� " + m.get(key) + "�� �ִ�");
		
		m.remove("���");
		System.out.println("����� ���� �� ������ " +m.size() + "����");
		
		m.clear();
		System.out.println("��� ���� �� ������ "+ m.size() + "����");
	}

}
