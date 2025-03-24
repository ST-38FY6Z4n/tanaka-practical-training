package jp.winschool.java.chapter6;

import java.time.DayOfWeek;
import java.time.YearMonth;

public class Kerenda_enshu {

	public static void main(String[] args) {
		// 現在の年月を取得
		YearMonth yearMonth = YearMonth.now();
		int year = yearMonth.getYear();
		int month = yearMonth.getMonthValue();

		System.out.println("カレンダー " + year + "年 " + month + "月");
		System.out.println("日 月 火 水 木 金 土");

		// 月初の曜日を取得
		DayOfWeek firstDay = yearMonth.atDay(1).getDayOfWeek();
		int daysInMonth = yearMonth.lengthOfMonth();

		// 日付の配置調整
		int dayOfWeekValue = firstDay.getValue(); // 月曜日=1
		//		System.out.println(dayOfWeekValue);
		for (int i = 0; i < dayOfWeekValue % 7; i++) {
			System.out.print("   "); // 空白
			}

		// 日付を出力
		for (int day = 1; day <= daysInMonth; day++) {
//			System.out.println((day+dayOfWeekValue)%7);
			System.out.printf("%2d ", day);
			if((day+dayOfWeekValue)%7==0){
				
				System.out.println();
			}

		}

	}

}
