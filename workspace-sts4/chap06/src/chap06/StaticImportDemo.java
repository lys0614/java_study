package chap06;

import java.util.Calendar;
//�Ϲ� import��
import static java.util.Arrays.sort;
//���� import��
public class StaticImportDemo {

	public static void main(String[] args) {
		
		int[] data = {3,5,1,7};
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		sort(data);
		// = Arrays.sort(data);
		
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		//���� import���� �ִٸ� Ŭ���� �̸� ���� ����� ����Ѵ�
		
		System.out.println("monday girl? "+Calendar.JANUARY);
		//import���϶��� Ŭ�����̸��� �Բ� �ʵ带 ����Ѵ�
		
		Calendar.getInstance();
		//import���϶��� Ŭ���� �̸��� �Բ� �޼��带 ����Ѵ�.
		
	}

}
