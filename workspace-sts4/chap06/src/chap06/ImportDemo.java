package chap06;
//import java.util.*; = java.util 패키지에 있는 모든 클래스를 호출함.
import java.util.Scanner;//java.util.Scanner 클래스 만 호출함.
import yolo.Cal.*;

public class ImportDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//import 문 없이 쓰려면
		//java.util.Scanner in = new java.util.Scanner(System.in); 으로 써야함
		//import 문을 사용해서 코드의 길이를 축약시킨거
		System.out.print("이름 입력 : ");
		String name = in.next();
		System.out.println(name);
		//이것도 java.lang.System.out.print(""); 해야함
		//근데 java.lang 패키지는 기본 패키지여서 따로 import해주지않아도 축약사용이 가능함
		
		Cal cal1 = new Cal();
		//같은 패키지 내에 있는 Cal 클래스의 Cal()메서드 실행
		cal1.output();
		
		yolo.Cal cal2 = new yolo.Cal();
		//다른 패키지(yolo)에 있는 Cal클래스의 Cal()메서드 실행
		cal2.output();
	}
	
}
