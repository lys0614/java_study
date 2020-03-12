package chap11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.*;
public class IteratorDemo {

	public static void main (String[] args) {
		List<String> list = new ArrayList<>();
		list.add("다람쥐");
		list.add("개구리");
		list.add("나비");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		Collections.sort(list);
		
		while(iterator.hasNext()) {//이미 반복을 수행한 반복자이므로 컬렉션의 원소를 수행할 수 없다.
			//따라서 아무런 내용도 출력하지 않는다.(콘솔의 2번째 줄이 공백인 이유)
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " "); 
		}
		
		
	}
}
