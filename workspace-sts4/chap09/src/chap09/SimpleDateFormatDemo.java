package chap09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		
		System.out.println(sdf1.format(d));//Date 개체를 날짜 포맷에 맞춘 문자열로 반환한다.
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		
		try {//예외처리 try~catch 블록
			d = sdf2.parse("2023-02-28");
		}catch(ParseException e) {}
		
		System.out.println(sdf1.format(d));
		System.exit(0);
	}

}
