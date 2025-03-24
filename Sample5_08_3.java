package jp.winschool.java.chapter5;

public class Sample5_08_3 {

	//スピードくじに挑戦できるか

	public static void main(String[] args) {
	int a = 399;
	int b = 300;
	int sub = a+b;

	System.out.println("商品 A の価格："+a+"円");
	System.out.println("商品 B の価格："+b+"円");
	System.out.println("購入金額の合計："+sub+"円");
	System.out.println();

	if(sub>=700){
	System.out.println("スピードくじに"+sub/700+"回挑戦できます！");
	}else{
	System.out.println("残念！挑戦できません。あと"+(700-sub)+"円分購入すると１回挑戦できます。");
	}

	}
}
