package Chapter09;

public class Java02Main {

	public static void main(String[] args) {
		Java01Hero h1 = new Java01Hero();
		h1.name = "ミナト";
		h1.hp = 100;

		Java01Hero h2 = new Java01Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		Java01Wizard w = new Java01Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}