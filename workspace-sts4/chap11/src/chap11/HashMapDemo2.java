package chap11;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Key, Value>변수명 = new HashMap<key, value>()형태로 선언 및 사용
		//HashMap은 순서가 상관 없음.
		Map<Element, Integer> map = new HashMap<>();
		map.put(new Element("안녕"), 1);//동일한 내용의 다른 객체를 HashMap에 추가한 후 크기를 조사한다.
		map.put(new Element("안녕"), 2);
		map.put(null, 3);//null도 키로 사용 가능
		System.out.println(map.size());
		System.out.println(map);
		
	}

}

