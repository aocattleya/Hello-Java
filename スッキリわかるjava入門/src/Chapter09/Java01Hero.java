package Chapter09;

public class Java01Hero {
	String name;
	int hp;
	Java02Sword sword;

	void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
}