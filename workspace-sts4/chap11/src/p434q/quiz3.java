package p434q;
import java.util.*;
public class quiz3 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("�迭��", 80);
		map.put("�ְ��", 90);
		map.put("����", 95);
		map.put("���ڹ�", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String id = in.nextLine();
		
		if(map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("����ڰ� �˻����� �ʽ��ϴ�");
		}
	}

}
