package chap10;

public class GenericlassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cup c1 = new Cup();
		
		//���׸� ��� �� RawŸ���� ���������� RawŸ�� ��� ��  Ÿ���� �����ϴ� �κ��� ���� ������ Object Ŭ���� Ÿ���� ����ؾ� ��
		//�ش� ��ü�� �ٽ� ���� Ÿ�� ��ȯ�� �Ͽ� ����ؾ� ��
		c1.setBeverage(new Beer());
		
		
		//���׸� Ŭ������ ����x�� ���� ���� Ÿ�� ��ȯ�� �ʿ����
		//���׸� Ŭ���� ��� �� Ÿ���� ���� �����Ƿ� Ÿ�� ��ȯ ���� ��� ���� 
//		Beer b = c1.getBeverage();
		Beer beer = (Beer) c1.getBeverage();
	}

}
