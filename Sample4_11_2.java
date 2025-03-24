package jp.winschool.java.chapter4;

public class Sample4_11_2 {

	//*計算試行錯誤*//

	public static void main(String[] args) {
		int a=5;
		int b=0;

		b=a+a++;
		System.out.println("b=a + a++ の結果："+b);
		//b(formula1)に代入したあと、aに１足している
		//そのため、答が11ではなく10になる

		a=5; b=0;
		b=a+ ++a;
		System.out.println("b=a + ++a の結果："+b);
		//普通に計算して出てくる答えと同じ、説明不要

		a=5; b=0;
		b=++a + --a;
		System.out.println("b =++a + --a の結果："+b);
		//--aを足すとき、aはすでに1足してあるので・・・

		a=5; b=0;
		b=++a + --a - a--;
		System.out.println("b= ++a + --a - a--の結果："+b);
		//b(formula1)に代入したあと、aから１引いている
		//そのため、答が5ではなく6になる

	}

}
