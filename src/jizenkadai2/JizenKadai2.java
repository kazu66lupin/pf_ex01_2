package jizenkadai2;

public class JizenKadai2 {

	public static void main(String[] args) {
		System.out.print("1～20の数値を入力してください：");
		int n = new java.util.Scanner(System.in).nextInt();
		convert(n);
	}
	//値により出力内容を表示するメソッド
	public static void convert(int n){
		if(n<=0 || n>=21){
			System.out.print("変換できません");
		}
		else if(n>=1 && n<=10){
			define(n);
		}
		else if(n>=11 && n<=20){
			System.out.print("Ⅹ");
			define(n);
		}
		else{
			System.out.print("入力が不正です");
		}
	}
	//一桁目の値それぞれにローマ数字を定義
	public static void define(int n){
		if(n%10==1){
			System.out.print("Ⅰ");
		}
		else if(n%10==2){
			System.out.print("Ⅱ");
		}
		else if(n%10==3){
			System.out.print("Ⅲ");
		}
		else if(n%10==4){
			System.out.print("Ⅳ");
		}
		else if(n%10==5){
			System.out.print("Ⅴ");
		}
		else if(n%10==6){
			System.out.print("Ⅵ");
		}
		else if(n%10==7){
			System.out.print("Ⅶ");
		}
		else if(n%10==8){
			System.out.print("Ⅷ");
		}
		else if(n%10==9){
			System.out.print("Ⅸ");
		}
	}
}
