package kadai_015;

//車クラス
public class Car_Chapter15 {
	
	//フィールド(内部データ)
	private int gear = 1; //ギア段階
	private int speed = 10; //速度
	
	//デフォルトコンストラクタ
	
	public Car_Chapter15() {
		
	}
	
	//コンストラクタ(初期化処理)
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	
	//【メソッド】ギア変更して速度を変える
	public void changeGear(int afterGear) {
		// TODO 自動生成されたメソッド・スタブ
		this.gear = afterGear;
		
		switch(this.gear) {
		
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		
		}

	}
	
	//【メソッド】ギア変更後の速度を表示する
	public void run() {
		System.out.println("ギアを" + this.gear + "に変更しました");
		System.out.println("ギア:" + this.gear + 
				"での速度は" + this.speed + "km");
	}


}
