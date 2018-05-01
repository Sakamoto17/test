package kadai;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Prac12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("year = ");
		int year = scn.nextInt();

		System.out.print("month = ");
		int month = scn.nextInt();

		scn.close();

		//日付を取得
		LocalDate date = LocalDate.of(year, month, 1);
		LocalDate nextmonth = date.plusMonths(1);
		LocalDate lastday = nextmonth.plusDays(-1);
		Period p = date.until(lastday);

		//祝日データ
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


		//出力
		System.out.println("*** " + year + "年" + month + "月"
				+ "の祝日カレンダー ***");

		for(int i = 0;i < p.getDays() + 1 ; i++) {
			System.out.print(date.plusDays(i));

			for(int j = 0 ; j < holidays.length ; j++) {
				LocalDate h = LocalDate.parse(holidays[j][0]);

				if(h.equals(date.plusDays(i))) {
					System.out.print(holidays[j][1]);
				}
			}
			System.out.println();
		}

	}

}


