package chap01;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹٿ����� ���� ���� �� �ش� ������ Ÿ���� �ݵ�� �Է��ؾ���
		// ������ ������ Ÿ���� �⺻�� int�� �ַ� �����
		// 32bit cpu�� ����ϸ鼭�� intũ�⸦ 32bit�� ������
		// 64bit cpu�� �ַ������� ������ int�� 32bit�� ����Ǿ�����
		
		int mach; // �޸𸮿� ������ ����
		int distance;
		mach = 340; // ������ ������ ����
		distance = mach * 60 * 60 ; // ������ �����Ͱ��� ������ �� ���� 
		
		System.out.println("�Ҹ��� 1�ð����� ���� �Ÿ� : "+ distance +"m");
		
		double radius; // �Ǽ��� ������ �޸𸮿� ����
		double area;
		
		//double ���� �⺻���̱� ������ ������ �ڿ� ���Ĵܾ �ʿ� ����.
		//float �� ��� ������ ���� f �� �ٿ��־�� ��
		//float �� double���� �޸𸮸� �� ����ؼ� ����
		radius = 10.0; // �Ǽ��� ������ ������ ����
		area = radius * radius * 3.14; // �Ǽ��� ������ �����Ͱ��� ������ �� ����
		System.out.println("�������� " + radius + "�� ���� ���� : "+area);
	}

}
