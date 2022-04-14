package sec5;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		String str = date.toString();
		Date e = date.valueOf(str);
		
		//캘린더 바로 심플포멧 못함
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String date1 = sdf1.format(now);
		
		System.out.println(date1);
		
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);

	}

}
