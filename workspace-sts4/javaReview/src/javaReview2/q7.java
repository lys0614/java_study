package javaReview2;

public class q7 {

	public static void main(String[] args) {
	
		GolfClub g1 = new GolfClub();
		g1.print();
		GolfClub g2 = new GolfClub(8);
		g2.print();
		GolfClub g3 = new GolfClub("����");
		g3.print();
	}
}

class GolfClub {
	String GolfName;
	//������ = Ŭ�������̶� ���� �̸��� ������ ������, �ν��Ͻ�ȭ �Ҷ� �Է��ϴ� �Ű������� ���� ���� �̸������� �ٸ� ȿ���� �� �� �ִ�. �����ε��� ������ �̿��� �� �ִٴ°�
	public GolfClub() {//�Ű������� ���� ������
		GolfName = "7�� ���̾� �Դϴ�";
	}
	public GolfClub(int a) {//�Ű������� �ִ� ������ 1
		GolfName = a+"�� ���̾� �Դϴ�";
	}
	
	public GolfClub(String a) {//�Ű������� �ִ� ������ 2
		GolfName = a+"�Դϴ�";
	}
	public void print() {
		System.out.println(GolfName);
	}
}
