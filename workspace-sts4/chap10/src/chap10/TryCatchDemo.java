package chap10;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		
		try {
			System.out.println("������ ���� : "+array[3]);//3���ε����� ������ ���⼭ ���ܹ߻�
			System.out.println("ù��° ���� : "+array[0]);//�� �������� ���ܹ߻������� ���⼭���� �������
		}catch(Exception e){
			System.out.println("���Ҿ���");
		}
		System.out.println("��");

		System.exit(0);
	}

}
