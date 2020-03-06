package q1;

public class Calculator {
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

	public Calculator(int a,int b) {
		setNum1(a);
		setNum2(b);
	}
	int sum() {
		return num1+num2;
	}
	
	int sub() {
		return num1-num2;
	}
	
	int multi() {
		return num1*num2;
	}
	
	int div() {
		return num1/num2;
	}
	
}
