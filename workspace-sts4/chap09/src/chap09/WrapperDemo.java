package chap09;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer bi1 = new Integer(10);//IntegerŸ�� ��ü ����
		
		int i1 = bi1.intValue();//IntegerŸ���� intŸ������ ��ȯ
		System.out.println(i1);
		
		double d = bi1.doubleValue();//IntegerŸ���� double Ÿ������ ��ȯ
		System.out.println(d);
		
		Integer bi2 = 20;//�ڵ� �ڽ�
		System.out.println(bi2);
		
		int i2 = bi2+20;//�ڵ� ��ڽ�
		System.out.println(i2);
		
		String s1 = Double.toString(3.14);//doubleŸ�� �����͸� StringŸ������ ��ȯ
		System.out.println(s1);
		
		Double pi = Double.parseDouble("3.14");//StringŸ���� DoubleŸ������ ��ȯ
		System.out.println(pi);
		
		Integer bi3 = Integer.valueOf("11", 16); // 16���� ���� ���ڿ��� 10���� integerŸ������ ��ȯ
		System.out.println(bi3);
	}

}
