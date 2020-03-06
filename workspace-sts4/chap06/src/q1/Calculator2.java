package q1;

public class Calculator2 extends Cal3{	
	Calculator2(int a, int b){
		super(a,b);
	}
	int div(){
		return num1/num2;
	}
	
}

class Numbers{
	int num1;
	int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Numbers(int a, int b) {
		setNum1(a);
		setNum2(b);
	}
}

class Cal1 extends Numbers{
	Cal1(int a, int b){
		super(a,b);
	}
	int sum(){
		return num1+num2;
	}
	
}

class Cal2 extends Cal1{
	Cal2(int a, int b){
		super(a,b);
	}
	int sub() {
		return num1-num2;
	}
	
}
class Cal3 extends Cal2{
	Cal3(int a, int b){
		super(a,b);
	}
	int multi() {
		return num1*num2;
	}
}