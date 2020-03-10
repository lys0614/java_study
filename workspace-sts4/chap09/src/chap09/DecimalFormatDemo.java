package chap09;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//~~~Format 류 클래스 들은 주로 보고서작성을 위해 프로그래밍을 할때 많이 사용들 한다.
		DecimalFormat f1 = new DecimalFormat("#");
		DecimalFormat f2 = new DecimalFormat("00000000.00");
		DecimalFormat f3 = new DecimalFormat("#.000");
		DecimalFormat f4 = new DecimalFormat("#,###.##");
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
		DecimalFormat f8 = new DecimalFormat("#.00%");
		
		System.out.println(f1.format(1234567.890));
		System.out.println(f2.format(1234567.890));
		System.out.println(f3.format(1234567.890));
		System.out.println(f4.format(1234567.890));
		System.out.println(f5.format(1234567.890));
		System.out.println(f6.format(1234567.890));
		System.out.println(f7.format(-1234567.890));
		System.out.println(f8.format(1234567.890));
		
	}

}
