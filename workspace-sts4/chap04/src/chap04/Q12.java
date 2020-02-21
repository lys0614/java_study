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
			System.out.println("모두 인쇄 하려면 "+(amount-numOfPapers)+"장 만큼 더 필요합니다."+numOfPapers+"장만 출력합니다");
			numOfPapers = 0;	
		}
		else if(amount == numOfPapers) {
			System.out.println(amount+"장 출력했습니다");
			numOfPapers = 0;
		}
		else if(amount < numOfPapers) {
			System.out.println(amount+"장 출력했습니다."+(numOfPapers - amount)+"장 만큼 남았습니다");
			numOfPapers -= amount;
		}
		else if(numOfPapers ==0) {
			System.out.println("용지가 없습니다");
		}
		
	}
	
	
	
}