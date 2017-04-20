package pond.swan;

import pond.shore.Bird;
//OCA Buch Seite 178
//compile: javac .\pond\swan\Swan.java
public class Swan extends Bird {
	public void swim() {
		floatInWater(); //package access to superclass
		System.out.println(text); //package access to superclass
		System.out.println(defaulText);  //does not compile!! defaultText ist nur im shore package erreichbar.
	}
	
	public void helpOtherSwan() {
		Swan other = new Swan();
		other.floatInWater(); //package access to superclass. Swan erbt von Bird und kann daher auf alle protected member zugreifen.
		System.out.println(other.text); //package access to superclass
	}
	
	public void helpOtherBird() {
		//Diese Methode ist zwar auch in Swan, das Object Bird ist aber auﬂerhalb des Bird package und kann daher nicht auf protected member zugreifen. 
		//Das objekt Bird wird innerhalb vom Swan erzeugt, daher sieht es so aus als sollte man Zugriff haben.
		Bird other = new Bird();
		other.floatInWater(); //does not compile!! 
		System.out.println(other.text); //does not compile!!
	}
}