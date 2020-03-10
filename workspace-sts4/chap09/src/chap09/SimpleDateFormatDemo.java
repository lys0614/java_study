package chap09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		
		System.out.println(sdf1.format(d));//Date ��ü�� ��¥ ���˿� ���� ���ڿ��� ��ȯ�Ѵ�.
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		
		try {//����ó�� try~catch ���
			d = sdf2.parse("2023-02-28");
		}catch(ParseException e) {}
		
		System.out.println(sdf1.format(d));
		System.exit(0);
	}

}
