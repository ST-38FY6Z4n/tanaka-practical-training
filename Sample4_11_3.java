package jp.winschool.java.chapter4;

public class Sample4_11_3 {

	//秒数を時間：分：秒に振り分けるツール

	public static void main(String[] args) {
	int sec = 5000;
	System.out.println("入力された秒数："+sec);

	int hour; int minute; int sec2;
	hour = sec/3600;
	minute = sec%3600/60;
	sec2 = sec%3600%60;

	System.out.println("時間：分：秒に分けた結果："+hour+"時間"+minute+"分"+sec2+"秒");
	}
}
