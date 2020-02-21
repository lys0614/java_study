package chap04;

public class Q12 {

	public static void main(String[] args) {
		
		Printer p = new Printer(10);
		p.Print(2);
		p.Print(20);
		p.Print(10);

	}

}

class Printer{
	private int numOfPapers;
	
	Printer(){
		
	}
	
	public Printer(int amount){
		numOfPapers = amount;
	}
	
	void Print(int amount) {
		if(amount > numOfPapers && numOfPapers > 0) {
			System.out.println("��� �μ� �Ϸ��� "+(amount-numOfPapers)+"�� ��ŭ �� �ʿ��մϴ�."+numOfPapers+"�常 ����մϴ�");
			numOfPapers = 0;	
		}
		else if(amount == numOfPapers) {
			System.out.println(amount+"�� ����߽��ϴ�");
			numOfPapers = 0;
		}
		else if(amount < numOfPapers) {
			System.out.println(amount+"�� ����߽��ϴ�."+(numOfPapers - amount)+"�� ��ŭ ���ҽ��ϴ�");
			numOfPapers -= amount;
		}
		else if(numOfPapers ==0) {
			System.out.println("������ �����ϴ�");
		}
		
	}
	
	
	
}