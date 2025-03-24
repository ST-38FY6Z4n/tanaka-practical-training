package Homework2;

public class Fukushu_1 {

	public static void main(String[] args) {
		int x_year = 2100;

		// うるう年か判定する
		boolean result = DateUtil.isLeapYear(x_year);
		if(result) {
			System.out.println("うるう年です");

		} else {
			System.out.println("うるう年ではありません。");

		}

		// 末日を取得する
		String yyyyMM = "2100/02";
		int x_lastDay = DateUtil.getLastDay(yyyyMM);
		System.out.println(yyyyMM + "の末日は" + x_lastDay + "日です。");
	}
}
