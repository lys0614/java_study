package p428q;

import java.util.*;

public class HashMapQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<>();
		
		dic.put("A", "��");
		dic.put("B", "��");
		dic.put("C", "��");
		dic.put("D", "��");
		dic.put("E", "��");
		
		for(String key : dic.keySet()) {
			System.out.printf("%s=%s  ", key, dic.get(key));
		}
		
		
	}

}

