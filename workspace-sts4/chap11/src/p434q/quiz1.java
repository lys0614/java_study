package p434q;
import java.util.*;

public class quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"갈매기","나비","다람쥐","라마"};

		List<String> list = Arrays.asList(arr);
		for(int i=0; i<list.size(); i++) {
			String elem = list.get(i);
			if(elem.length() == 2) {
				System.out.print(elem + " ");
			}
		}
		
	}
	
}
