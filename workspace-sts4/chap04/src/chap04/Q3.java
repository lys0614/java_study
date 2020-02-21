package chap04;

public class Q3 {

	public static void main(String[] args) {
		Printer3 p3 = new Printer3(20, true);
		p3.print(25);
		p3.setDuplex(false);
		p3.print(10);
		p3.print(1);
	}

}

class Printer3{
	private int numOfPapers;
	private boolean duplex;
	
	public Printer3(int numOfPapers, boolean duplex) {
		(this).numOfPapers = numOfPapers;
		(this).duplex = duplex;
	}
	
	void print(int amount) {
		if(this.numOfPapers == 0) {
			System.out.println("용지가 없습니다");
		}
		else if(duplex == false && numOfPapers < amount) {
			System.out.println("단면으로 출력하려면 "+(amount - numOfPapers)+"장 모자랍니다. "+numOfPapers+"장만 출력합니다");
			(this).numOfPapers = 0;
		}
		else if (numOfPapers > 0) {
			if(amount %2 == 0) {
				int yang = amount/2;
				System.out.println("양면으로 "+(yang)+"장 출력했습니다. 현재 "+(numOfPapers - yang)+"장 남아있습니다.");
				(this).numOfPapers = numOfPapers - yang;
			}
			else if(amount%2 != 0) {
				int yang = amount/2+1;
				System.out.println("양면으로 "+(yang)+"장 출력했습니다. 현재 "+(numOfPapers - yang)+"장 남아있습니다.");
				(this).numOfPapers = numOfPapers - yang;
			}
		}
		
		

	}
	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

}