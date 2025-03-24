package jp.winschool.java.chapter4;

public class Sample4_11_4 {

	//金額をお札と小銭に振り分けるツール

	public static void main(String[] args) {
	int money = 26698;

	int man;
	int gosen;
	int sen;
	int gohyaku;
	int hyaku;
	int goju;
	int ju;
	int go;
	int ichi;

	man=money/10000;
	gosen=money%10000/5000;
	sen=money%10000%5000/1000;
	gohyaku=money%10000%5000%1000/500;
	hyaku=money%10000%5000%1000%500/100;
	goju=money%10000%5000%1000%500%100/50;
	ju=money%10000%5000%1000%500%100%50/10;
	go=money%10000%5000%1000%500%100%50%10/5;
	ichi=money%10000%5000%1000%500%100%50%10%5/1;

	System.out.println("10000 円札："+man+"枚");
	System.out.println(" 5000 円札："+gosen+"枚");
	System.out.println(" 1000 円札："+sen+"枚");
	System.out.println("  500 円玉："+gohyaku+"枚");
	System.out.println("  100 円玉："+hyaku+"枚");
	System.out.println("   50 円玉："+goju+"枚");
	System.out.println("   10 円玉："+ju+"枚");
	System.out.println("    5 円玉："+go+"枚");
	System.out.println("    1 円玉："+ichi+"枚");




	}
}
