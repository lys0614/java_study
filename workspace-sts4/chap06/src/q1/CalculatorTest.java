package q1;
//��1)Calculator Ŭ������ �����ϰ� ��� ���� int Ÿ�� num1,num2����
//sum, sub, multi, div �޼��� ����, �� �޼��带 ����Ͽ� �Էµ� 2���� ���ڸ� �����ϴ� ���α׷��� �ۼ��ϱ�
//�����ڸ� ���ؼ� ���� 2���� �Է� ����
//2���� ��� ������ ������ �� �ִ� getter, setter ����

//��2) Calculator Ŭ������ ������ ������ Ŭ���� Calculator2 ����
//Ŭ���� Numbers�� ������� num1,num2 ��������
//Ŭ���� Cal1�� ��� �޼��� sum()�� ������ ����, Ŭ���� Number�� ��ӹ���
//Ŭ���� Cal2�� ��� �޼��� sub()�� ������ ����, Ŭ���� Number�� ��ӹ���
//Ŭ���� Cal3�� ��� �޼��� multi()�� ������ ����, Ŭ���� Number�� ��ӹ���
//Ŭ���� Calculator2�� ����޼��� div()�� ������ ���� Cal3 ��ӹ���
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10,3);
		int result1 = cal.sum();
		int result2 = cal.sub();
		int result3 = cal.multi();
		int result4 = cal.div();
		System.out.println("�� ���� �� = "+result1);
		System.out.println("�� ���� �� = "+result2);
		System.out.println("�� ���� �� = "+result3);
		System.out.println("�� ���� ���� = "+result4);
		System.out.println("--------------------------");
		
		Calculator2 cal2 = new Calculator2(10,3);
		System.out.println(cal2.sum());
		System.out.println(cal2.sub());
		System.out.println(cal2.multi());
		System.out.println(cal2.div());
		
		
		
	}
	
}
