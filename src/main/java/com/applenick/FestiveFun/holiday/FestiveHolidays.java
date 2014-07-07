package com.applenick.FestiveFun.holiday;

import java.util.Calendar;

import org.bukkit.ChatColor;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.applenick.FestiveFun.utils.Alog;

public class FestiveHolidays {
	
	public static DateTimeFormatter dtf = DateTimeFormat.forPattern("EEEE, MMMM, dd, yyyy");
	
	public static void loginStart(){		
		Calendar cal = Calendar.getInstance();
		
		
		Instant now = Instant.now();
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate localDate = ldt.toLocalDate();
		
		Alog.consoleMsg(ChatColor.GOLD + "Today is " + ChatColor.GREEN + now.toString(dtf));
		
	}

}
