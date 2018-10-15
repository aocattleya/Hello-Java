package Chapter08;

import java.util.Random;

public class Question1Cleric {
	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.hp = this.maxHp;
		this.mp = 5;
		System.out.println("HPが最大まで回復した。");
	}

	public int play(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");

		// 理論上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を計算する
		int recoverActual = Math.min(this.maxMp - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した。");
		return recoverActual;
	}
}