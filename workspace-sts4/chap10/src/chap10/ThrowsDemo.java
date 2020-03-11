package chap10;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Á¤¼ö ¾Æ´Ô");
		}
		
	}

	private static void square(String s) throws NumberFormatException{
		int n= Integer.parseInt(s);
		System.out.println(n*n);
	}
	
}
