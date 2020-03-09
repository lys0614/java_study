package p275q;

public class CountableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인터페이스 Countable 을 쓸때
//		Countable[] m = {new Bird("뻐꾸기", 5), new Bird("독수리",2), new Tree("사과나무",5), new Tree("밤나무",5)};
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

		//  추상클래스 Countable을 쓸 때 
	Countable[] c = {new Bird("뻐꾸기",5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)};
	
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
