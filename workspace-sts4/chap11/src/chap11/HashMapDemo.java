package chap11;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap 선언
		Map<String, Integer> m = new HashMap<>();
		
		m.put("사과", 5);//데이터 저장
		m.put("바나나", 3);
		m.put("딸기", 1);
		m.put("포도", 10);

		System.out.println(m.size()+"종류의 과일이 있다");
		
		for(String key : m.keySet())
			//get(key)메서드를 통해서 Map객체가 가지고 있는 데이터를 불러옴
			System.out.println(key + "가 " + m.get(key) + "개 있다");
		
		String key = "바나나";
		//해당 map 객체에 지정한 키가 존재하는지 확인
		if(m.containsKey(key))
			System.out.println(key + "가 " + m.get(key) + "개 있다");
		
		m.remove("사과");
		System.out.println("사과를 없앤 후 과일은 " +m.size() + "종류");
		
		m.clear();
		System.out.println("모두 없앤 후 과일은 "+ m.size() + "종류");
	}

}
