package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//HashMap宣言
	HashMap<String, String> fruitMap = new HashMap<String, String>();
	
	//HashMapリスト作成
	public Dictionary_Chapter21() {
	fruitMap.put("apple","りんご");
	fruitMap.put("peach","桃");
	fruitMap.put("banana","バナナ");
	fruitMap.put("lemon","レモン");
	fruitMap.put("pear","梨");
	fruitMap.put("kiwi","キウイ");
	fruitMap.put("strawberry","いちご");
	fruitMap.put("grape","ぶどう");
	fruitMap.put("muscat","マスカット");
	fruitMap.put("cherry","さくらんぼ");
	}
	
	//単語検索メソッド
	 public void referer(String[] dicArray) {
	   for (String word : dicArray) {
	     if (fruitMap.containsKey(word)) {
	         String meaning = fruitMap.get(word);
	         System.out.println(word + "の意味は" + meaning);
	      } else {
	         System.out.println(word + "は辞書に存在しません");
	      }
	  }
   }

}
