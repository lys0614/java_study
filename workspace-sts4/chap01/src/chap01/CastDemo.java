package chap01;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		// Ÿ�� ��ȯ = ���� �ٸ� ������ Ÿ���� �����ϱ� ���� ������ ������ Ÿ������ ��ȯ�ϴ°�
		// byte -> int / float -> double / int -> double
		// �ڵ� Ÿ�� ��ȯ : ���� �ٸ� ������ Ÿ���� ���� �� �� ū ������ Ÿ������ �ڵ����� ��ȯ�Ͽ� ������ �����ϴ� ��
		double d1 = 5 * 3.14; // int Ÿ�� 5�� doubleŸ�� 3.14�� �����ϸ� �ڵ� Ÿ�� ��ȯ�� �߻��Ͽ� 5.0 * 3.14 �� �����
		double d2 = 1; // int Ÿ�� 1�� double �� ���� d2�� ���� �� �ڵ����� 1.0�� d2�� �����

		// ���� Ÿ�� ��ȯ : Ư���� ������ Ÿ������ ����ڰ� ���� ������ Ÿ���� ��ȯ�ϴ� ��
		// ����
		// ��ȯ�� ������ Ÿ�� �����Ͱ�;
		float f = (float) 3.14; // float�� ���� f�� double�� ������ 3.14�� ������ �� �����Ƿ� double�� ���� ��ȯ �Ѱ�
		byte b1 = (byte) 300; // byte�� ���� b �� int�� ������ 300�� ������ �� �����Ƿ� ���������� byte������ ��ȯ
		byte x = (byte) 3.14; // byte�� ������ double�� ������ 3.14�� ������ �� �����Ƿ� ���������� byte������ ��ȯ
		double dd = (double) 3.14f;
		i = 7 / 4;// ���������� �����̹Ƿ� �Ҽ��� �ڸ��� ǥ�þ���
		System.out.println(i);
		d = 7 / 4;// ���������� �����̹Ƿ� ����� 1 ������ double Ÿ�� ������ �����ؼ� 1.0�� ��
		System.out.println(d);
		d = 7 / (double) 4;// ������ �Ǽ��� �����̹Ƿ� �Ǽ��� �Ǽ� �������� �ڵ���ȯ�ϰ� �� ������� �Ǽ��� �� 1.75�� ����
		System.out.println(d);
		// i =7/(double)4 �� �� ��� Ÿ�� ����ġ ������ �߻��Ѵ�.
		i = 300;//int Ÿ�� ���� i�� �� 300 ����
		// 300�� byte Ÿ���� �� ���� ���̿� ���� �����Ƿ� byte������ ����ȯ �Ұ�
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("Byte Ÿ������ ������ �� �����ϴ�.");
		} else {
			b = (byte) i;
		}
		System.out.println("----------------------------------");
		int intb = 100;
		double dbb = intb;// �ڵ� Ÿ�� ��ȯ
		System.out.println("int Ÿ�� ���� : " + intb);
		System.out.println("dobuleŸ�� ���� : " + dbb);
		intb = (int) 3.14;
		System.out.println(intb); // 3.14�� �Ҽ��� �� �ڸ��� ���ŵ�, ���� Ÿ�� ��ȯ
		System.out.println("----------------------------------");

	}
}
