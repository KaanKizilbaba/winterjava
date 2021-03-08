package day20passbyvaluepassbyreferencedate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		
		//How to create date object
		LocalDate currentDate1 = LocalDate.now();
		
		System.out.println(currentDate1);//2021-03-07
		
		System.out.println(currentDate1.plusDays(5));//2021-03-12
		System.out.println(currentDate1.plusMonths(3));//2021-06-07
		System.out.println(currentDate1.plusYears(2));//2023-03-07
		
		System.out.println(currentDate1.plusDays(3).plusMonths(2).plusYears(1));//2022-05-10
		
		System.out.println(currentDate1.getYear());//2021
		System.out.println(currentDate1.getMonth());//MARCH
		System.out.println(currentDate1.getMonthValue());//3
		System.out.println(currentDate1.getDayOfMonth());//7
		System.out.println(currentDate1.getDayOfYear());//66
		System.out.println(currentDate1.getDayOfWeek());//SUNDAY
		
		System.out.println(currentDate1.minusDays(12));//2021-02-23
		System.out.println(currentDate1.minusMonths(5));//2020-10-07
		System.out.println(currentDate1.minusYears(2));//2019-03-07
		
		System.out.println(currentDate1.minusYears(2).plusMonths(3).minusDays(5));//2019-06-02
		
		LocalDate date2 = LocalDate.of(2019, 03, 05);
		System.out.println(currentDate1.isAfter(date2));//true
		System.out.println(currentDate1.isBefore(date2));//false
		
		//How to create time object
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);
		
		System.out.println(currentTime1.plusHours(3));//Test the other plus methods
		
		System.out.println(currentTime1.minusMinutes(6));//Test the other minus methods
		
		System.out.println(currentTime1.getSecond());//Test the other get methods
		
		System.out.println(currentTime1.now(ZoneId.of("Japan")));//04:17:03.202123
		System.out.println(currentTime1.now(ZoneId.of("Turkey")));//22:17:28.740694
		System.out.println(currentTime1.now(ZoneId.of("Europe/Moscow")));//22:17:28.740694
		
		//How to create an object from LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);//2021-03-07T14:20:55.069401
		
		LocalDate currentDate2 = LocalDate.now();
		System.out.println(currentDate2);//2021-03-07
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");//M==>Months, m==>minutes
																		//MMM==>First 3 characters
																		//MM==>The number of the month (03-04-etc.)
																		//MMMM==>Full month name
																		//M==>The number of month (3-4-etc.)
		System.out.println(dtf2.format(currentDate2.plusMonths(9)));//21/Mar/07
		
		LocalTime currentTime2 = LocalTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("hh:mm");//hh==> is for am-pm time format
		  															  //HH==> is for 24 hours system
		
		System.out.println(dtf3.format(currentTime2));//02:40
		
	
		//How to find difference between two dates
		LocalDate d1 = LocalDate.now();
		
		LocalDate bd1 = LocalDate.of(1997, 5, 23);
		
		//If you want to get year, month, and day in age use the below code
		Period age = Period.between(bd1, d1);
		System.out.println(age);//23Y9M12D
		
		//If you want to get just year in age use the following code
		int ageYear = Period.between(bd1, d1).getYears();
		System.out.println(ageYear);//23

	}

}
