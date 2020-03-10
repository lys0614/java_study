package chap09quiz;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car("�׷���");
		Car yourCar = new Car("�׷���");
		String bigyo ;
		Date date = new Date();
		
		if(myCar.equals(yourCar.getName()) == true) {
			bigyo = "����";
		}
		else{
			bigyo = "�ٸ���";
		}
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-YYYY");
		String s = MessageFormat.format("�� �� [{0}], �� �� [{1}] ��  {2}", myCar.getName(), yourCar.getName(), bigyo);
		String s1 = MessageFormat.format("��¥: {0}, �ڵ��� �� = {1}, ������(ȫ�浿)", sdf1.format(date), myCar.getName());
		System.out.println(s);
		System.out.println(s1);

		StringTokenizer token = new StringTokenizer(s1," =,()");
		//���忡 �ִ� ���ڵ��� ���ڴ����� �����Ͽ� �����Ϸ��Ҷ� ���� Ŭ���� StringTokenizer.
		//StringTokenizer(������ ���ڿ� ������, "���ǵ�");
		//���ǵ鿡�� ���鹮�ڵ� �����ϹǷ� ���ǰ� ���� ���̿� ������ �Ƚᵵ �ȴ�.
		//��, �� ���忡�� ���� ������ ������ ���鹮�� / = / , / ( / ) �̴�.
		System.out.println(token.countTokens());
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

class Car{
	String name;
	public Car(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(String yourCar){
		if(this.name == yourCar) {
			return true;
		}
		else{
			return false;
		}
	}
}