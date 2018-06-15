package Package1;
public class AccessModifiers {

	 // 4 access Modifiers - public, private,protected and No modifiers
	public static void main(String[] args) {
		AccessModifiersCars c1 = new AccessModifiersCars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		c1.publicSpeed = 100;
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
	}
}

