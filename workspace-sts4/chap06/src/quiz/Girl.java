package quiz;

public class Girl {

//	String name;
	protected String name;//��ӹ��� Ŭ������ ���ٰ���
	
	void show() {//��ӵǴ� �޼����̱� ������ �������̵��� ��������
		System.out.println(name+"�� �ڹ� �ʺ����̴�");
	}
	
	public Girl(String name) {//�Ű������� �ִ� ������
		this.name = name;
	}

}

class GoodGirl extends Girl{
	//GoodGirl �����ڰ� ���� ������ ������ �߻���. �����Ϸ��� �ڵ����� �⺻ �����ڸ� �����Ͽ� �����
	public GoodGirl(String name){
		//Goodgirl Ŭ������ Girl Ŭ������ ��ӹ޾����Ƿ� �⺻�����ڿ� super()�� �ԷµǾ� ����
		//super()�� �θ� Ŭ������ Girl �� �⺻ �����ڸ� ȣ���ϰ� �ȴ�.
//		Girl Ŭ������ �̹� �ٸ� �����ڰ� �־� �⺻ �����ڰ� �ڵ����� ��µǴ� ��Ȳ���� ������ �߻��Ѵ�.
//	�׷��� �⺻ �����ڸ� �����̴��� �ϳ� ����� �ָ� ������ �������
		super(name);
	}
	
	void show() {
		System.out.println(this.name+"�� �ڹٸ� �ȴ�");
	}
//	
}

class BestGirl extends GoodGirl{

	BestGirl(String name){
		super(name);
	}
	
	void show() {
		System.out.println(this.name+"�� �ڹٸ� �ſ� �� �ȴ�");
	}
	
}