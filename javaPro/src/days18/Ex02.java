package days18;

import java.util.Calendar;

/**
 * @author yusica
 * @data 2025. 1. 20. - 오전 9:44:30
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// Calendar 클래스
		//Calendar c = new Calendar(); X
		Calendar c = Calendar.getInstance();
		//java.util.GregorianCalendar[time=1737333982514,
		// areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		//zone=sun.util.calendar.ZoneInfo[id="GMT+09:00",
		//offset=32400000,dstSavings=0,useDaylight=false,
		//transitions=0,lastRule=null],firstDayOfWeek=1,
		//minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=0,
		//WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,
		//DAY_OF_MONTH=20,DAY_OF_YEAR=20,DAY_OF_WEEK=2,
		//DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=46,SECOND=22,
		//MILLISECOND=514,ZONE_OFFSET=32400000,DST_OFFSET=0]
		System.out.println(c);
		
		//년
		System.out.println(c.get(Calendar.YEAR));
		//월
		System.out.println(c.get(Calendar.MONTH) + 1);
		//일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //해당월의 몇일
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); //해당년의 몇일
		
		//시간
		System.out.println(c.get(Calendar.HOUR));
		//분
		System.out.println(c.get(Calendar.MINUTE));
		//초
		System.out.println(c.get(Calendar.SECOND));
		//밀리초
		System.out.println(c.get(Calendar.MILLISECOND));
		//요일 - 일 ~ 토
		// Data 0 ~ 6
		// Calendar 1 ~ 7
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
	}

}
