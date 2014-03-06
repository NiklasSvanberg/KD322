
public abstract class Mammal extends Animal{
	int diaTime;
	
	public Mammal(String latinName, int diaTime) {
		super(latinName); //Skickar direkt till superklassen
		this.diaTime = diaTime;
	}

}
