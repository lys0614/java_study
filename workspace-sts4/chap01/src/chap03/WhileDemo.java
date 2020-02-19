package chap03;

public class WhileDemo {

	public static void main(String[] args) {
		System.out.println("===========while 1=============");
		int i = 1;
		while(i < 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n ===========while 2=============");
		int row = 2;
		while(row<10) {
			System.out.print("������ "+row+"�� : ");
			int column = 1;
			while(column < 10) {
				System.out.printf("%4d", row*column);//%4d = 4�ڸ��� 10������ ����϶�� ��, ���ڸ��� ������
				//%-4d�̸� 10���� 4�ڸ��� �̸�, ����������. �׷��� ���ڸ��� ������
				//ex) : %-4d �� 10 ǥ�� > "10  "
				column++;
			}
			System.out.println();
			row++;
		}
		
		System.out.println("===========do while 1=============");
		
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 5);
		
		System.out.println("\n===========do while 2=============");
		
		int x = 10;
		do {
			x++;//������ ���� �ʾƵ� do ������ 1�� �����ϱ� ������ x�� ������ ����.
		}while(x<5);
		System.out.println("do~while�� ������ x : "+x);
		
		x = 10;
		while(x<5) {
			x++;//������ ���� �ʾƼ� �ڵ带 �ѹ��� �������� �����Ƿ� x�� ���� ����
		}
		System.out.println("while�� ������ x : "+x);
		
		
		System.exit(0);
	}
}
