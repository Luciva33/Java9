
public class code {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("");
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		//System.out.println("最強の武器は" + h.sword.name);
		
		h.attack();
		
		
		Hero h1 = new Hero("");
		h1.name = "恩田";
		h1.hp  = 100;
		Hero h2 = new Hero("");
		h2.name = "アサカ";
		h2.hp  = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp  = 50;
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
		
		
	}

}
