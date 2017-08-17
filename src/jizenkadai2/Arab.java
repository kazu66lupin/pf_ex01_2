package jizenkadai2;

public class Arab {
	public String convert(int i) {
		if(i>=1 && i<=10){
			return define(i);
		}
		else if(i>=11 && i<=20){
			return "Ⅹ" + define(i);
		}
		return "変換できません";
	}

	private String define(int n) {
		if(n%10==1){
			return "Ⅰ";
		}
		else if(n%10==2){
			return "Ⅱ";
		}
		else if(n%10==3){
			return "Ⅲ";
		}
		else if(n%10==4){
			return "Ⅳ";
		}
		else if(n%10==5){
			return "Ⅴ";
		}
		else if(n%10==6){
			return "Ⅵ";
		}
		else if(n%10==7){
			return "Ⅶ";
		}
		else if(n%10==8){
			return "Ⅷ";
		}
		else if(n%10==9){
			return "Ⅸ";
		}
		return null;
	}

}
