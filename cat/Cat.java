package jp.winschool.java.training;

public class Cat {
	String name;//猫の名前
	double weight;//猫の体重(kg)
	String personality; //猫の性格

	double addweight;
	double afterweight;//猫のアフター体重(kg)

	void eat(String food,int number){
		if(food=="ツナ缶"){
			if(number>=4){
				System.out.println("ツナ缶を与えすぎです。なにかの間違いでは？");
			}else{
				addweight=number*0.2;
				afterweight=weight+addweight;
				System.out.println(name+"はツナ缶を"+number+"つ食べました。");
				System.out.println("体重が"+(Math.round(addweight*1000))+"g増えました。現在"+afterweight+"kgです");
			}
		}else if(food=="ダイエットフード"){
			if(number>=4){
				System.out.println("ダイエットフードを与えすぎです。なにかの間違いでは？");
			}else{
				addweight=number*0.1;
				afterweight=weight+addweight;
				System.out.println(name+"はダイエットフードを"+number+"つ食べました。");
				System.out.println("体重が"+(Math.round(addweight*1000))+"g増えました。現在"+afterweight+"kgです");
			}
		}
	}

	void sleep(int sleepTime){
		System.out.println(name+"は"+sleepTime+"時間寝ました。");
		if(sleepTime<12){
			System.out.println("睡眠不足です。睡眠前の体重は"+weight+"kg、睡眠後は"+(weight-0.1)+"kgです");
		}else if(sleepTime>=12&&sleepTime<=16){
			System.out.println("適切な睡眠時間です。睡眠前の体重は"+weight+"kg、睡眠後は"+(weight-0.3)+"kgです");
		}else if(sleepTime>16){
			System.out.println("寝すぎです。睡眠前の体重は"+weight+"kg、睡眠後は"+weight+"kgです");

		}

	}
}
