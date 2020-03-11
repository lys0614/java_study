package chap10;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividend = 30;
		
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("원소 없음");
		}catch(NumberFormatException e) {
			System.out.println("숫자 아님");
		}catch(ArithmeticException e) {
			System.out.println("0으로 못나눔");
		}finally {
			System.out.println("이건 항상 나오는 문구");
		}
		System.out.println("끘");
		System.exit(0);
	}

}
