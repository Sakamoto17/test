package tsd;

import java.time.LocalDate;
import java.time.Period;

public class Sample9_1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, 12, 31); //LocalDateはnewできない

//		date = date.plusDays(1);  呼び出した、または今日の日付からずらすとき
		System.out.println("date             :" + date);
		System.out.println("date.plusDays(1) :" + date.plusDays(1));

		System.out.println("date             :"+ date);

		System.out.println("--------------------------------------------");

		LocalDate now = LocalDate.now();
//		now = now.plusDays(1);  呼び出した、または今日の日付からずらすとき
		System.out.println("今日の日付   :" + now);
		LocalDate tomorrow = now.plusDays(1);
		System.out.println("明日の日付   :" + tomorrow);

		Period p = now.until(tomorrow);

		System.out.println(p.getDays());

		System.out.println("");

		System.out.println(now.withDayOfMonth(1)); //その月の1日

		LocalDate firstDay = LocalDate.now().withDayOfMonth(1);
		LocalDate LastMonth = firstDay.plusMonths(1);
		LocalDate lastDay = LastMonth.minusDays(1);
		System.out.println(lastDay); //月末)


	}


}
