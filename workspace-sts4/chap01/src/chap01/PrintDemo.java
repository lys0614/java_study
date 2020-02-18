package chap01;

public class PrintDemo {
	public static void main(String[] args) {
		//자바에서 단순히 콘솔창에 출력하기
		//System.out.println(); : 괄호안의 내용을 입력하고 라인변경(엔터키 한번 눌렀다는 뜻)
		//System.out.print(); : 화면에 내용을 출력, 자동라인변경이 없음
		//System.out.printf(); : 화면에 내용을 출력 시 지정한 포멧에 맞게 출력
		
		System.out.println("출력후 라인변경");
		System.out.print("출력후");
		System.out.println("~라인변경없음~");
		System.out.printf("출력 후 ");
		
		//printf() 사용법
		// System.out.printf("포맷명시",데이터1,데이터2);
		// 포멧사용시 필요한 특수기호
		// %d = 10진수 숫자 / %o = 8진수 숫자 / %x = 16진수 숫자 / %c = 문자 1자 / %5d = 10진수숫자 5자리 /
		// %-5d = 10진수 숫자 5자리, 왼쪽정렬 / %05d = 10진수 숫자 5자리, 빈자리는 0으로 채움 / %f = 실수 출력
		// %e = 실수를 지수 형식으로 출력 / %4.1f = 4자리 실수, 소수점이하는 1자리 / %04.1f = 4자리실수 소수점이하는 1자리. 빈자리는 0으로 채움
		// %-4.1f = 4자리실수, 소수점 이하는 1자리, 왼쪽정렬
	}
}
