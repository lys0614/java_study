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
//		System.out.println("외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+StudentNum+", 국적 : "+Nationality+"]");
		
	public String show() {
		return "외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+StudentNum+", 국적 : "+Nationality+"]";
	}
	
}
