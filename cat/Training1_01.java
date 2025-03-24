package jp.winschool.java.training;

public class Training1_01 {

	public static void main(String[] args) {
	Cat cat1 = new Cat();
	Cat cat2 = new Cat();

	cat1.name="こはだ";
	cat1.weight=12.5;
	cat1.personality="やんちゃ";
	cat2.name="ロック";
	cat2.weight=18.0;
	cat2.personality="のんびり";

	System.out.println("猫 café 通信");
	System.out.println("今月、2 匹の猫をお迎えしました。");
	System.out.println("<1 匹目>");
	System.out.println("名前："+cat1.name);
	System.out.println("体重："+cat1.weight+"kg");
	System.out.println("性格："+cat1.personality);
	System.out.println();

	cat1.eat("ツナ缶",2);
	cat1.sleep(15);

	System.out.println();
	System.out.println();

	System.out.println("<2 匹目>");
	System.out.println("名前："+cat2.name);
	System.out.println("体重："+cat2.weight+"kg");
	System.out.println("性格："+cat2.personality);
	System.out.println();

	cat2.eat("ダイエットフード",3);
	cat2.sleep(18);
	cat2.eat("ダイエットフード",5);
	}


}
