package chap01;
import java.util.Scanner;
// import : 이미 만들어져 있는 자바의 내장 클래스나 다른 사람이 만들어놓은 클래스를 현재의 파일로 로딩해서 사용하는 것
public class ScannerDemo {

	public static void main(String[] args) {
		
		//Scanner 클래스의 객체를 생성하여 사용
		// new : 클래스의 복제체인 객체를 생성하는 명령어
		
		Scanner in = new Scanner(System.in);
		System.out.println("첫 숫자 입력 : ");		
		int x = in.nextInt();
		System.out.println("두번재 숫자 입력 : ");
		int y = in.nextInt();
		//출력할때 출력할 데이터의 형식을 직접 지정해줄수 있는 printf
		System.out.printf("%d * %d 는 %d 입니다 \n", x, y, x*y);
		System.out.println(x + " 와 " + y +" 의 곱은 " + x*y + "입니다");
		
		//Scanner 클래스가 제공하는 데이터 타입 메서드
		// next() : 문자열을 입력받음
		// nextByte() : Byte 타입의 데이터를 입력받음
		// nextShort() : short 타입의 데이터를 입력 바음
		// nextInt() : int 타입의 데이터를 입력 받음
		// nextLong() : Long타입의 데이터를 입력 받음
		// nextFloat() : float 타입의 데이터를 입력 받음
		// nextDouble() : double 타입의 데이터를 입력받음
		// nextLine() : 문자열을 입력받음
		
		System.out.print("이름을 입력하세요");
		String name = in.next();
		System.out.println("이름 : " + name);
	}

}
