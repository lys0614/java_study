package chap01;
import java.util.Scanner;
public class ArtihmeticDemo {
	public static void main(String[] args) {
		//연산자
		//자바스크립트의 연산자와 동일함
		
		//산술 연산자 : +,-,*,/,% 사칙연산자
		//대입 연산자 : =, +=, -=, *=, /=, %=, 연산 우선순위가 가장 느림
		//비교 연산자 : >, >=, <, <=, ==, !=, instanceof, 데이터 값을 비교하는 연산자.
			// instanceof는 클래스의 복제체인 객체를 해당 클래스와 비교하기위한 연산자, 형 변환이 가능한지 확인할때 사용한다
		String str = new String();
		StringBuilder sb = new StringBuilder();
		//instanceof 연산자는 일부러 false가 나오는 연산을 입력했을때 sts 시스템적으로 오류를 바로 출력하기 때문에
		//고의로 false를 낼 수 없다.
		if(str instanceof String) {
			System.out.println("객체 str은 String 클래스의 객체이다 ");
		}
		else {
			System.out.println("객체 str은 String 클래스의 객체가 아니다 ");
		}
		
		if(sb instanceof StringBuilder) {
			System.out.println("객체 sb은 StringBuilder 클래스의 객체이다 ");
		}
		else {
			System.out.println("객체 sb은 StringBuilder 클래스의 객체가 아니다 ");
		}
		System.out.println("-------------------------------------------------------------------");
		
		//비트 연산자
			// &, |, ~, ^ 등 비트 연산을 위한 연산자. IoT, 임베디드 에서 주로 활용함
		//논리 연산자
			// &&, ||, ~(not 연산자) - 논리 연산을 위한 연산자, if문에서 조건을 2개 이상 사용하고자 할때 씀
		System.out.println("-------산술 연산 예제-------");
		int remainder = 25*2;
		System.out.println("25 / 2 의 나머지는 : " + remainder + "이다");
		
		System.out.println("-------비교논리 연산 예제---------");
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));//||연산자 (or연산자)는 첫 항이 true 가 뜨면 나머지 항의 계산은 이행하지 않는다.
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x<1) | (y-- <1));// | 연산자는 첫 항에서 true 가 떠도 이후의 계산을 이행한다. 그래서 y-- < 1 은 false를 띄우게 되고 y--를 진행한다. 
		//이후 y 값을 출력함으로써 y=0 이 출력된다.
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("---비트연산자---");
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte)~0b00000001);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);
		
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);
		System.out.println("---대입연산자---");
		
		int value = 1;
		value += 1;
		System.out.println("값 = "+value);
		value -= 1;
		System.out.println("값 = "+value);
		value %= 3;
		System.out.println("값 = "+value);
		//증감 연산자 : ++,--, 단항 연산자라고도 함. 해당 항의 값을 1 증감시킴, 연산 우선수위가 가장 빠름. 앞에 붙으면 실행 하기 전에 증감하고 실행하고, 뒤에 붙으면 실행이 끝나고 증감함
		//한 라인에서 단항연산자가 단독으로 사용될 경우 피연산자가 앞에있거나 뒤에있거나 상관없음
		System.out.println("---증감연산자---");
		int data = 1;
		data++;
		System.out.println("data++ 함 " + data);
		
		int data2 = 10;
		System.out.println("++전위증감 연산자 사용 후 data2의 값 : "+ ++data2);
		System.out.println("후위증감++ 연산자 사용 후 data2의 값 : "+ data2++);
		System.out.println("현재 data2값 : "+data2);
		System.out.println("--전위증감 연산자 사용 후 data2의 값 : "+ --data2);
		System.out.println("후위증감-- 연산자 사용 후 data2의 값 : "+ data2--);
		System.out.println("현재 data2값 : "+data2);
	}
}
