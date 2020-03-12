package p434q;
import java.util.*;
public class quiz3 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String id = in.nextLine();
		
		if(map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("사용자가 검색되지 않습니다");
		}
	}

}
