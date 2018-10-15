package Chapter09;

public class Java01Main {

	public static void main(String[] args) {

		Java02Sword s = new Java02Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Java01Hero h = new Java01Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
	}
}