package tsd;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sample9_2 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(12, 34, 56, 78);
		System.out.println("time          :" + time);

		System.out.println("time.plusHours(10): "+ time.plusHours(10));

		System.out.println("time          :" + time);

		System.out.println("---------------------------------");

		LocalTime now = LocalTime.now();
		System.out.println("現在時刻     :" + now);

		LocalTime afterOneHour = now.plusHours(1);
		System.out.println("1時間後の時刻 :" + afterOneHour);

		LocalTime nano0 = now.withNano(0);
		System.out.println("現在時刻     :"+ nano0);

		System.out.println("now.equals(nano0)          :" + now.equals(nano0));
		System.out.println("now.withNano(0).equals(nano0): " + now.withNano(0).equals(nano0));

		LocalDate date1 = LocalDate.of(2018, 4, 1);
		LocalDate date2 = LocalDate.of(2018, 5, 1);

		//isAfter 不等号的には　＞
		//isBefore 不等号的には　＜

		if(date1.isAfter(date2)) {
			System.out.println(date1 + " is after "+ date2);
		}else {
			System.out.println(date2 +" is after " + date1);
		}

		if(date1.isBefore(date2)) {
			System.out.println(date1 + " is before "+ date2);
		}else {
			System.out.println(date2 + " is before "+ date1);
		}

		//parse
		LocalDate date3 = LocalDate.parse("2018-04-04"); //形式を合わせる（区切りはハイフンのみ、0も入れる)


		System.out.println(date3);

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //年月日 0の数だけイニシャル入る
		LocalDate date4 = LocalDate.now();
		String str = date4.format(formatter2);
		System.out.println(str);

	}

}
