package chap06;

public class One1 extends One{
//One Ŭ������ ��ӹ���
	void print() {
		
//		System.out.println(secret); ���������ڰ� private�� ��ӾȵǼ� ���پȵ�
		System.out.println(roommate); //default ���������� -> ����ڰ� ���ٰ���
		System.out.println(child);//protected ���������� -> ����ڰ� ���ٰ���
		System.out.println(anybody);//public ���������� -> ����ڰ� ���ٰ���, ��Ӱ��� + �ܺ����ٰ���
	}
//	@Override
//	void show() {
//		
//	}
	
	
}
