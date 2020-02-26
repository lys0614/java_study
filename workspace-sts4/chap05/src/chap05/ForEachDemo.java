package chap05;

public class ForEachDemo {

	public static void main(String[] args) {
		
		
		int scores[] = new int[] {100, 90, 50, 95, 85};
		int sum = 0;
		
		//일반 for문 사용
		for (int i=0; i<scores.length; i++) {
			sum = sum+scores[i];
		}
		
		System.out.println("for 문을 사용한 평균 : "+sum/5.0);
		
		//for ~ each 문 사용
		sum=0;
		
		for(int i : scores) {
			sum = sum+i;
		}
		
		System.out.println("for~each 문을 사용한 평균 : "+sum/5.0);
		
		
		
	}

}
