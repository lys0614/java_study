package javaReview2;

public class Rectangle {
	//Ŭ���� ��� ����
	//Ŭ���� ������ ��ü������ ����ϴ� ����
	
	
	//Ŭ������ �����
	int width=50;//Ŭ������ ��� ����
	int height=100;//Ŭ������ ��� ����
	
	public void area1() {//Ŭ������ ��� �޼���
		int width = 10;//�޼��� area1()�� ���� ����
		int height = 5;//�޼��� area1()�� ���� ����
//		area1()�� ����ɶ� �޸𸮿� ��ϵǰ� ������ �޸𸮿��� ���ŵ�		
		System.out.println("�簢���� ���̴� : "+(width*height));
	}
	
	public void area2() {
		int x = 10;
		int y = 5;
		
		System.out.println("�������� x*y = "+x*y);
		System.out.println("Ŭ���� ��� ���� width*hegiht�� "+width*height);
	}
	
	public void area3() {
		int width = 10; // �������������� Ŭ������ ���� ��� ������ ������ �̸�
		int height =  5;// �������������� Ŭ������ ���� ��� ������ ������ �̸�
		//�̸��� ������ Ŭ���� ���� ��� �������� ���������� �켱������ ������.
		//(this). �� ����ϸ� Ŭ���� ���� ��������� ȣ���� �� ����.
		System.out.println("�������� width*height = "+width*height);
		System.out.println("Ŭ���� ��� ���� width*hegiht�� "+this.width*this.height);
	}
	public void area4() {
		int x = 0;
		for(int i = 0; i < 5; i++) {
			int y=0;
			System.out.println("���� x�� �� : "+x+"\n ���� y�� �� : "+y+"\n");
			x++;
			y++;
		}
		
	}
}
