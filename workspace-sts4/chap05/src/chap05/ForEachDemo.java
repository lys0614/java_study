package chap05;

public class ForEachDemo {

	public static void main(String[] args) {
		
		
		int scores[] = new int[] {100, 90, 50, 95, 85};
		int sum = 0;
		
		//�Ϲ� for�� ���
		for (int i=0; i<scores.length; i++) {
			sum = sum+scores[i];
		}
		
		System.out.println("for ���� ����� ��� : "+sum/5.0);
		
		//for ~ each �� ���
		sum=0;
		
		for(int i : scores) {
			sum = sum+i;
		}
		
		System.out.println("for~each ���� ����� ��� : "+sum/5.0);
		
		
		
	}

}
