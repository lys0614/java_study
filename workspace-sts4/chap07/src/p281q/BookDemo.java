package p281q;

import java.util.Arrays;

public class BookDemo {

	public static void main(String[] args) {

		int[] bookss = {new Book(15000).price, new Book(50000).price, new Book(25000).price};
		
		System.out.println("정렬 전");
		for(int i=0;i<bookss.length;i++) {
			System.out.println("price = "+bookss[i]);
		}

		System.out.println("정렬 후");
		Arrays.sort(bookss);
		for(int i=0;i<bookss.length;i++) {
			System.out.println("price = "+bookss[i]);
		}
		
		Book[] bo = {new Book(15000), new Book(50000), new Book(25000)};
		
		System.out.println("정렬 전");
		for(Book b : bo) {
			b.show();
		}
		
	}

}

class Book{
	int price;
	
	public Book(int a){
		this.price = a;
	}
	
	void show() {
		System.out.println("price = "+this.price);
	}
}