package chap10;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {0,1,2};
		try {
			int x = array[3];

		}catch(Exception e) {
			System.out.println("��");
		}
//		catch(ArrayIndexOutOfBoundsException e) {//���� catch��Ͽ��� ��� ���ܸ� ó���ϰ� �����Ƿ� �� ��Ͽ� �����Ҽ��� ���� ������ ������ �߻��Ѵ�(���� ���� �׾�����)
//			System.out.println("���Ҿ���");
//		}
		System.out.println("��");
		System.exit(0);
		
	}

}
