package chap11;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list�� ����� ������ �ڷᱸ�������� index�� ���� �ߺ����� �ȴ�
		String[] fruits = {"���","�ٳ���","����","����"};

		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();
		
		//�迭 fruits�� �����ִ� ��� ��Ҹ� SetŸ���� ��ü h1�� ��� ����
		for(String s : fruits) {
			h1.add(s);
		}
		
		System.out.println("1�ܰ� : "+h1);
		h1.add("�ٳ���");//Set Ÿ���� ��ü h1�� ���ڿ� '�ٳ���' �߰�, �׷��� �ߺ������� �ȵǱ⶧���� ������� ����.
		h1.remove("����");//h1�� ���� �ִ� ���ڿ� �߿��� '����' ����
		h1.add(null);//h1�� null �߰� // �ݷ��ǿ��� add()�޼���� �����͸� �߰��ϴ� ��ɾ�, ���� �ڿ� �߰���.
		
		System.out.println("2�ܰ� : "+h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("����"));
		
		List<String> list = Arrays.asList(fruits); // �迭�� List Ÿ������ ��ȯ
		h2.addAll(list);//Set Ÿ���� ��ü h2�� list�� ������ �ִ� ��� ���Ӥ��� ����
		System.out.println("3�ܰ� : "+h2);
		h2.clear();//SetŸ���� ��ü h2�� ������ �ִ� ��� ������ ����
		System.out.println(h2.isEmpty());//h2�� ����ִ��� Ȯ��
		
	}

}
