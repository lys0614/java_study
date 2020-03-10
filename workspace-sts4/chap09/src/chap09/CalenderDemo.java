package chap09;
import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		System.out.println(now);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		System.out.println("YEAR " + c.get(Calendar.YEAR));
		System.out.println("MONTH " + c.get((Calendar.MONTH) + 1));
		
		System.out.println("DAY OF MONTH " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY OF WEEK " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("WEEK OF YEAR " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK OF MONTH " + c.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("HOUR " + c.get(Calendar.HOUR));
		System.out.println("HOUR OF DAY " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE " + c.get(Calendar.MINUTE));
	}

}
