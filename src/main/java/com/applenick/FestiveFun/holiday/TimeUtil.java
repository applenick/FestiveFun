package com.applenick.FestiveFun.holiday;

import java.util.Calendar;
import java.util.Date;

import org.ocpsoft.prettytime.PrettyTime;

import com.applenick.FestiveFun.utils.Alog;

public class TimeUtil {	

	public static void setupCalendar(){
		 PrettyTime timeformat = new PrettyTime();
		 Calendar cal = Calendar.getInstance();
		 
		 Date time = new Date();
		 
		 cal.set(time.getYear(), time.getMonth(), time.getDay());
		 Alog.info("Today is" + cal.getTime().toString());
		 Alog.info("PrettyTime: " +  timeformat.format(cal));
	}
}
