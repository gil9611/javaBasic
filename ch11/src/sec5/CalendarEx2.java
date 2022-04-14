package sec5;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		//싱글톤
		Calendar date = Calendar.getInstance();
		
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);	//0~11
		int day = date.get(Calendar.DAY_OF_MONTH);
		int week = date.get(Calendar.DAY_OF_WEEK);
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		
		System.out.println(year+"년"+(month+1)+"월"+day+"일");

	}

}
