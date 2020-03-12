package chap11;
import java.util.HashSet;
import java.util.Set;

class Element{
	String value;
	
	public Element(String value) {
		this.value = value;
	}

		// �� �κ��� �ּ�ó������ �ϸ� hashcode�� �������Ƿ� �ߺ� ������ �ȵǴ� HashSet�� �ι��� �߰��߿� �ѹ��� ������Ų��
//	public int hashCode() {
//		return value.hashCode();
//	}
	
	public boolean equals(Object o) {
		boolean result = false;
		
		if(o instanceof Element) {
			Element el = (Element)o;
			if(value.equals(el.value)) {
				result = true;
			}
		}
		return result;
//		if(o instanceof Element) {
//			return((Element)o).value.equals(value);
//		}
//		return false;
	}
	
	public String toString() {
		return "Element["+value+"]";
	}
}



public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Element> h = new HashSet<>();
		h.add(new Element("�ȳ�"));// �⺻������ Set Ÿ���� �ߺ��� ������� ����
		h.add(new Element("�ȳ�"));// ������ ������ �ٸ� ��ü�� �߰��ϴ� ������� HashSet�� �ٸ� ��ü�� ����ؼ� �ΰ� �߰� ����, Element Ŭ���� Ÿ������ 2�� �����߱� ������ ������ ������ �ٸ� ��ü��
		System.out.println(h.size());
		System.out.println(h);
	}
	
}
