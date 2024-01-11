

public class Hero {	  //クラス名は大文字
	
	String name;      //フィールド宣言
	int hp;
	Sword sword;     //勇者が装備している剣の情報   has-aの関係
	
	
	public void attack(){
		
		System.out.println(this.name + "は"+ this.sword. name+"で攻撃した！");
		System.out.println("敵に" +  ( 5 + this.sword.damage )   +"ポイントのダメージをあたえた！");
	}
	
	public Hero(String name) {       
		//コンストラクタ インスタンス化されたときに自動実行
		this.hp =100;
		this.name = name;                 //引数の値でnameフィールドを初期化
	}
	
public Hero() {           				  // コンストラクタのオーバーロード
		this("ダミー");                   //別のコントラクタを呼び出す
	
	}
	
	
	public void sleep() { 
		
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
		//printf("%dは、眠って回復した！\n",this.name);
		//println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + " 秒すわった！");
		System.out.println("HPが" + sec + " ポイント回復した！");
		
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした！");
		
	}
}

