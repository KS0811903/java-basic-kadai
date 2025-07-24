package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分の手を入力するメソッド
	public String getMyChoice() {
		//Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//入力した内容を取得する
		String input = scanner.nextLine();

		//正しい手が入力されたか確認
		while (!input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("正しい手を入力してください");
			input = scanner.nextLine();
		}
		return input;
		
	}
	
	//相手の手をランダムに選択するメソッド
	public String getRandom() {
		String[] choiceArray = {"r","s","p"};
		double i = Math.random() * 3;
		i = Math.floor(i);
		return choiceArray[(int) i];

	}
	
	//自分と相手の手を比較し、結果を表示するメソッド
	public void playGame() {
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		String me = this.getMyChoice();
		String cpu = this.getRandom();
		System.out.println("自分の手は" + hand.get(me) + "," + "対戦相手の手は" + hand.get(cpu));
		
		if(me.equals(cpu)) {
			System.out.println("あいこです");
		}else if (me.equals("r") && cpu.equals("s") || me.equals("s") && cpu.equals("p") || me.equals("p") && cpu.equals("r")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}

}
