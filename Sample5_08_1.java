package jp.winschool.java.chapter5;

public class Sample5_08_1 {

	//bmiを計算するツール

	public static void main(String[] args) {

	int height = 159;
	int weight = 50;
	double bmi = (weight/(((double)height/100)*((double)height/100)));

	System.out.println(bmi);
	if(bmi<18.5){
		System.out.println("身長："+height);
		System.out.println("体重："+weight);
		System.out.println("あなたは\"低体重\"です");
	}else if(bmi>=18.5&&bmi<25){
		System.out.println("身長："+height);
		System.out.println("体重："+weight);
		System.out.println("あなたは\"普通体重\"です");
	}else if(bmi>=25){
		System.out.println("身長："+height);
		System.out.println("体重："+weight);
		System.out.println("あなたは\"肥満\"です");
	}
	if(bmi<18.5){

	}

	//elseで指定してよかったのか
	}

}
