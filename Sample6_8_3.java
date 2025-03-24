package jp.winschool.java.chapter6;

import java.util.Random;

public class Sample6_8_3 {

	//1000円を目標にランダム金額を貯金、貯まったら「達成しました」と表示するツール

	public static void main(String[] args) {
		System.out.println("目標金額：1000 円");

		int i=1;
		int sum=0;
		int min=0;
		int max=499;
		int randmoney=0;
		Random rand = new Random();

		while(sum<=1000){

			randmoney=rand.nextInt((max-min)+1)+min;
			sum+=randmoney;
			System.out.println(i+"回目の貯金額："+randmoney+"\t(現在\\"+sum+")");
			i++;
		}
		System.out.println("達成しました！");


	}
}
