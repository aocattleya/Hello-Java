package Chapter09;

public class Java01Wizard {
	String name;
	int hp;

	void heal(Java01Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}