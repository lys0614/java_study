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
			System.out.println("������ �����ϴ�");
		}
		else if(duplex == false && numOfPapers < amount) {
			System.out.println("�ܸ����� ����Ϸ��� "+(amount - numOfPapers)+"�� ���ڶ��ϴ�. "+numOfPapers+"�常 ����մϴ�");
			(this).numOfPapers = 0;
		}
		else if (numOfPapers > 0) {
			if(amount %2 == 0) {
				int yang = amount/2;
				System.out.println("������� "+(yang)+"�� ����߽��ϴ�. ���� "+(numOfPapers - yang)+"�� �����ֽ��ϴ�.");
				(this).numOfPapers = numOfPapers - yang;
			}
			else if(amount%2 != 0) {
				int yang = amount/2+1;
				System.out.println("������� "+(yang)+"�� ����߽��ϴ�. ���� "+(numOfPapers - yang)+"�� �����ֽ��ϴ�.");
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