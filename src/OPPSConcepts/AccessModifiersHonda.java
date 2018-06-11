
package OPPSConcepts;
import Package1.*;
public class AccessModifiersHonda extends AccessModifiersCars {
	
	public void increaseHondaSpeed() {
		AccessModifiersCars c1 = new AccessModifiersCars();
		c1.publicSpeed = 10;
		c1.setPrivateSpeed(10);
		protectedSpeed = 100;
		
	}

}
