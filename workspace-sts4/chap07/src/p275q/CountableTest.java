package p275q;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������̽� Countable �� ����
//		Countable[] m = {new Bird("���ٱ�", 5), new Bird("������",2), new Tree("�������",5), new Tree("�㳪��",5)};
//		
//		for (Countable c : m) {
//			c.count();
//		}
//		
//		for(int i=0; i<m.length;i++) {
//			if(m[i] instanceof Bird) {
//				((Bird)m[i]).fly();
//			}
//			else if(m[i] instanceof Tree) {
//				((Tree)m[i]).ripen();
//			}
//		}

		//  �߻�Ŭ���� Countable�� �� �� 
	Countable[] c = {new Bird("���ٱ�",5), new Bird("������", 2), new Tree("�������", 10), new Tree("�㳪��", 7)};
	
	for(Countable c1 : c) {
		c1.count();
	}
	for(int i=0;i<c.length;i++) {
		if(c[i] instanceof Bird) {
			((Bird)c[i]).fly();
		}
		else if(c[i] instanceof Tree) {
			((Tree)c[i]).ripen();
		}
	}
//	
	
	
	}

}
