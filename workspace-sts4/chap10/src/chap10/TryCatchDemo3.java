package chap10;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {0,1,2};
		try {
			int x = array[3];

		}catch(Exception e) {
			System.out.println("ㅋ");
		}
//		catch(ArrayIndexOutOfBoundsException e) {//앞의 catch블록에서 모든 예외를 처리하고 있으므로 이 블록엔 도달할수가 없기 떄문에 오류가 발생한다(빨간 줄이 그어진다)
//			System.out.println("원소없음");
//		}
		System.out.println("끘");
		System.exit(0);
		
	}

}
