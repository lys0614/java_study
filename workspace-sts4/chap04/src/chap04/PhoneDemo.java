package chap04;

//���� Ŭ���� : ���� Ŭ������ PhoneDemo�� �����ϱ� ���ؼ� �ʿ��� Ŭ����
class Phone {// Ŭ���� ����
	//�ʵ�
	//��� ����
	String model; // �� ���� ������ ��� ����
	int value; // ������ ������ ��� ����
	
	//void�� ����, ����ٶ�� �ǹ̰�. ��ȯ���� ������ ����
	void print() {//�޼���(�Լ�)�� ()�� �ʿ���
		System.out.println(value + "�� ��¥�� " + model + "����Ʈ��");
	}
}

public class PhoneDemo {
	//���� Ŭ����
	//Ŭ���� �� �������� ������ Ŭ�������� ���� �����ڸ� public���� ����Ѵ�
	//Ŭ������ ���赵�� ������ ����� �ʿ��� ()�� �ʿ����
	public static void main(String[] args) {
		Phone myPhone = new Phone(); // Ŭ���� Phone �� new Ű���带 ���ؼ� �ν��Ͻ�ȭ �� == �޸𸮿� �����
		myPhone.model = "������s20"; // ���� model���ٰ� ������s20�� ���� ���ε�. myPhone�̶�� Ŭ�������� model�̶�� ������ �����Դٴ� ��.
		myPhone.value = 160;// ���� value���ٰ� 160�� �������ε� myPhone�̶�� Ŭ�������� value��� ������ �����Դٴ� ��
		myPhone.print();// myPhoneŬ������ �ִ� print()��� �޼��带 ������� �׸��� �޼��� �ȿ� �ִ� ���۵��� ������
		
		Phone yourPhone = new Phone(); // Ŭ���� Phone�� yourPhone �̶�� �̸����� �޸𸮿� �����.
		yourPhone.model = "G6";
		yourPhone.value = 85;
		myPhone.print();
	}

}
