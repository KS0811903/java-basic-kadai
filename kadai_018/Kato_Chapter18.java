package kadai_018;

abstract public class Kato_Chapter18 {
	
	//姓フィールド
	String familyName = "加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address = "東京都中野区○×";
	
	//名前を表すフィールドの値を設定する
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	//共通の紹介メソッド
	private void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介の抽象メソッド
	abstract public void eachIntroduce();
	
	//紹介メソッド
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
	

}
