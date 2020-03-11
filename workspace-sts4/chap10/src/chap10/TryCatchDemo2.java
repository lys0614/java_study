package chap10;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividend = 30;
		
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� ����");
		}catch(NumberFormatException e) {
			System.out.println("���� �ƴ�");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}finally {
			System.out.println("�̰� �׻� ������ ����");
		}
		System.out.println("��");
		System.exit(0);
	}

}
