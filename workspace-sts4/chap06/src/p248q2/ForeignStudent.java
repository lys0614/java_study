package p248q2;

public class ForeignStudent extends Student {

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	String Nationality;

	public ForeignStudent(String a, String b, int c, int d){
		super(a,c,d);
		setNationality(b);
	}
	
//	void show() {
//		System.out.println("�ܱ��л�[�̸� : "+name+", ���� : "+age+", �й� : "+StudentNum+", ���� : "+Nationality+"]");
		
	public String show() {
		return "�ܱ��л�[�̸� : "+name+", ���� : "+age+", �й� : "+StudentNum+", ���� : "+Nationality+"]";
	}
	
}
