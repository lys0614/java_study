package p428q;

import java.util.*;

public class HashMapQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<>();
		
		dic.put("A", "가");
		dic.put("B", "나");
		dic.put("C", "다");
		dic.put("D", "라");
		dic.put("E", "마");
		
		for(String key : dic.keySet()) {
			System.out.printf("%s=%s  ", key, dic.get(key));
		}
		
		
	}

}

