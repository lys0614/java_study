package chap10;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2};
		
		try {
			System.out.println("마지막 원소 : "+array[3]);//3번인덱스가 없으니 여기서 예외발생
			System.out.println("첫번째 원소 : "+array[0]);//전 문구에서 예외발생했으니 여기서부터 실행안함
		}catch(Exception e){
			System.out.println("원소없음");
		}
		System.out.println("ㅋ");

		System.exit(0);
	}

}
