package quiz;

public class GirlTest {

	public static void main(String[] args) {
		
//		Girl g1 = new Girl(); //Ŭ���� Girl �� ��ü�� ����
//		Girl g2 = new GoodGirl(); //�θ�Ŭ���� Girl�� ��ü�� ����ϰ� �ڽ� Ŭ���� GoodGirl�� ��ü�� ����, �θ� Ŭ���� Ÿ������ ����Ǿ��� ������ Girl Ŭ������ ���� ����� ��� �����ϴ�.
//		GoodGirl gg = new BestGirl(); //�θ�Ŭ����  GoodGirl�� ��ü�� ����ϰ� �ڽ�Ŭ���� BestGirl�� ��ü�� ����, �θ�Ŭ���� Ÿ������ ����Ǿ��� ������  GoodGirl Ŭ������ ���� ����� ��� �����ϴ�.
//		
		
		//g2.show();//Girl Ŭ������ show()�޼��尡 �����Ƿ� g2�� show()�޼��带 ����� �� ����
//		gg.show(); //BestGirl Ŭ���� ���� show()�޼��带 ��ӹ޾� �������̵��Ͽ� ����с�
		
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
		
		for(Girl g : girls) {
			g.show();//�������� ����Ͽ� �ϳ��� �޼���� �������� �޼��带 ������ ȿ��
		}
		System.out.println("----------------------");
	}


}