package chap10;

public class GenericClassDemo {

	public static void main(String[] args) {
		Cup c = new Cup();
		
		c.setBeverage(new Boricha());//CupŬ���� Ÿ���� ��ü c�� Boricha Ŭ���� Ÿ���� ��ü ����
		
		c.setBeverage(new Beer());//Cup Ŭ���� Ÿ�� ��ü c�� Beer Ŭ���� Ÿ�� ��ü�� �ٽ� ����
		//������ Boricha ũ���� Ÿ���� ��ü�� �����ǰ� Beer Ŭ���� Ÿ���� ��ü�� ����
		
		try {
			Beer b1 = (Beer) c.getBeverage();//���������� ����� Beer Ŭ���� Ÿ���� ��ü�� ���
			
			Boricha b2 = (Boricha) c.getBeverage();
			// c.setBeverage() �� ���ؼ� Beer Ŭ���� Ÿ���� ��ü�� �����߱� ������ ������ Boricha Ŭ���� Ÿ���� ��ü�� �����Ǿ� ����
			//������ ������ ������ ��Ÿ�� ���ܸ� �߻���Ŵ
		}
		catch(Exception e) {
			System.out.println("Ÿ�Ժ�ȯ�� �����߻�");
		}
		
	}
}


class Beer {}
class Boricha {}

class Cup<T> {
	private T beverage; // Object Ŭ���� Ÿ���� ��� ����
	
	public T getBeverage() {
		return beverage;
	}
	//Object Ŭ���� Ÿ���� �Ű� ����
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}