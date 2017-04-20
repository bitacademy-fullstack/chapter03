package util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal  = Calendar.getInstance();
		printDate( cal );
		
		//특정 날짜 세팅하기
		cal.set( Calendar.YEAR, 1971 );
		cal.set( Calendar.MONTH, 12 );
		cal.set( Calendar.DATE, 18 );
		//cal.set( 2007, 10, 12 );
		
		//기념일
		cal.add( Calendar.DATE, 10000 );
		
		printDate( cal );
	}
	
	public static void printDate( Calendar cal ) {
		String[] days = { "일", "월", "화", "수", "목", "금", "토" };
		
		int year = cal.get( Calendar.YEAR  );
		// 0~11
		int month = cal.get( Calendar.MONTH );
		int date = cal.get(Calendar.DATE );
		//1(일) ~ 7(토) 
		int day = cal.get(Calendar.DAY_OF_WEEK );
		int am = cal.get( Calendar.AM_PM );
		
		int hour = cal.get( Calendar.HOUR );
		int min = cal.get(Calendar.MINUTE );
		int sec = cal.get(Calendar.SECOND );
		
		System.out.println(
			year + "년 " +
		    (month + 1) + "월 " +
			date + "일 " + 
		    days[day - 1] + "요일 " +
			( am == 0 ? "오전 " : "오후 " ) + 
			hour + ":" + min + ":" + sec );
	}
}
