package kadai;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("year =");
		int year = scn.nextInt();

		System.out.print("month =");
		int month = scn.nextInt();

		int day;

		scn.close();

		System.out.println("***"+year+"年"+month+"月の祝日カレンダー***");

		String[][] holidays = {
				{ "2018-01-01", "元日" },
				{ "2018-01-08", "成人の日" },
				{ "2018-02-11", "建国記念の日" },
				{ "2018-02-12", "振替休日" },
				{ "2018-03-21", "春分の日" },
				{ "2018-04-29", "昭和の日" },
				{ "2018-04-30", "振替休日" },
				{ "2018-05-03", "憲法記念日" },
				{ "2018-05-04", "みどりの日" },
				{ "2018-05-05", "こどもの日" },
				{ "2018-07-16", "海の日" },
				{ "2018-08-11", "山の日" },
				{ "2018-09-17", "敬老の日" },
				{ "2018-09-23", "秋分の日" },
				{ "2018-09-24", "振替休日" },
				{ "2018-10-08", "体育の日" },
				{ "2018-11-03", "文化の日" },
				{ "2018-11-23", "勤労感謝の日" },
				{ "2018-12-23", "天皇誕生日" },
				{ "2018-12-24", "振替休日" }
			};


		//[7][1],[8][1],[9][1]を出力したい
//
		LocalDate firstDay = LocalDate.of(year,month,1);//月初め
		LocalDate LastMonth = firstDay.plusMonths(1);
		LocalDate lastDay = LastMonth.minusDays(1);//月末
		Period p = firstDay.until(lastDay);

//		String format = firstDay.format();
//		LocalDate holiday = static LocalDate parse(holidays);
//		String[] holiday = new String;
//
//		private static LocalDate parse(String[][] holidays) {
//			return LocalDate holiday;
//		} 間違い

		for(int i = 0; i <= p.getDays(); i++) {
			System.out.print(firstDay.plusDays(i));

			for(int j = 0; j < holidays.length; j++) {
				LocalDate l = LocalDate.parse(holidays[j][0]);
				if( l.equals(firstDay.plusDays(i))) {
					System.out.print(holidays[j][1]);
				}
			}
			System.out.println(); //ここで改行を入れると、ちゃんとなる

		}
	}
}



//		for(int i = 0; i <= p.getDays(); i++) {
//			System.out.println(firstDay.plusDays(i));
//		}
//カレンダー作成


//		//While ver. memorize
//		LocalDate date = LocalDate.of(year, month, 1);
//		while(date.getMonthValue() == month) {
//			System.out.print(date);
//
//			for(String[ ] holiday : holidays) {
//				String str = holiday[0];
//				LocalDate target = LocalDate.parse(str);
//
//				if(date.equals( target )) {
//					System.out.print(holiday[1]);
//				}
//			}
//			System.out.println();
//			date = date.plusDays(1);
//		}

