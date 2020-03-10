package chap09;

class Garbage{
	public int no;
	
	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage(%d) 생성 \n" , no);
	}
	//오버라이딩 됨
	//가비지 수거부분을 확인하기 위하여 오버라이딩 화면 출력
	protected void finalize() {
		System.out.printf("Garbage(%d) 수거 \n", no);
	}
}

public class GarbageDemo {

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			new Garbage(i);
		}
		System.gc();
	}
}
