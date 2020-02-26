package chap05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>(); // integer 타입의 ArrayList 객체를 생성한다
		//ArrayList<> 뒤의 ()는 생성자를 실행시켰다는 표시이다.
		int data;
		int sum = 0;
		
		while((data = in.nextInt()) > 0)//키보드에서 입력된값이 음수가 아닐때까지 반복
			scores.add(data);//데이터를 동적 배열에 추가
		
		for(int i=0; i < scores.size(); i++) {
			sum += scores.get(i);//동적 배열의 i번째 원소를 가져와서 변수 sum에 합함
		}
		System.out.println("평균 = "+sum / scores.size());
		System.out.println(scores);

		ArrayList<String> test = new ArrayList<>();
		System.out.println(test.size());
		test.add("ArrayList는");
		System.out.println(test.size());
		test.add("배열과 비슷하지만");
		System.out.println(test.size());
		test.add("크기가 동적으로");
		System.out.println(test.size());
		test.add("조절이 가능함");
		System.out.println(test.size());
	
		String arrStr[] = new String[5];
		System.out.println(arrStr.length);
		arrStr[0]="배열은";
		System.out.println(arrStr.length);
		arrStr[1]="ArrayList와 비슷하지만";
		System.out.println(arrStr.length);
		arrStr[2]="크기가";
		System.out.println(arrStr.length);
		arrStr[3]="고정되어";
		System.out.println(arrStr.length);
		arrStr[4]="있음";
		System.out.println(arrStr.length);
	}

	
}
