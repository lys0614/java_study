package chap06;

import java.util.Calendar;
//일반 import문
import static java.util.Arrays.sort;
//정적 import문
public class StaticImportDemo {

	public static void main(String[] args) {
		
		int[] data = {3,5,1,7};
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		sort(data);
		// = Arrays.sort(data);
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		//정적 import문이 있다면 클래스 이름 없이 멤버를 사용한다
		
		System.out.println("monday girl? "+Calendar.JANUARY);
		//import문일때는 클래스이름과 함께 필드를 사용한다
		
		Calendar.getInstance();
		//import문일때는 클래스 이름과 함께 메서드를 사용한다.
		
	}

}
