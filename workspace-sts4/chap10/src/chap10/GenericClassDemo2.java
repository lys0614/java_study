package chap10;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup2<Boricha> c = new Cup2<Boricha>();
		Cup2<Beer> b = new Cup2<Beer>();
		c.setBeverage(new Boricha());
//		c.setBeverage(new Beer()); Cup2 Ŭ���� Ÿ���� ��ü c�� Boricha Ŭ���� Ÿ������ �����Ǿ� �����Ƿ� BeerŬ���� Ÿ���� ��ü�� ������ �� ����, ���嵵 �� �� ����
		
//		Beer b = c.getBeverage(); Cup2 Ŭ���� Ÿ���� ��ü c�� Boricha Ŭ���� Ÿ������ �����Ǿ� �����Ƿ� BeerŬ���� Ÿ���� ��ü�� ������ �� ����
		Boricha b1 = c.getBeverage();
		
	}

}

class Cup2<T>{//���׸� Ÿ������ Ŭ���� ����
	
	private T beverage; // T Ÿ���� ��� ����
	
	public T getBeverage() {//TŸ������ ��� ������ ���
		return beverage;
	}
	//T Ÿ���� �Ű� ����
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}