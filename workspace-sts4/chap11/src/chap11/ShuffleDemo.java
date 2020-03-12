package chap11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ShuffleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> list = new ArrayList<>();
		
		for(char c = 'A'; c <= 'G'; c++)
			list.add(c);
		
		System.out.println("¼¯±â Àü : " + list);
		Collections.shuffle(list);
		System.out.println("¼¯Àº ÈÄ : "+list);
		
	}

}
