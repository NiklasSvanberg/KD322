import java.util.ArrayList;


/**
 * @author Niklas
 * Detta är en klass
 */
public class BikeStore {

	private ArrayList<Bike> bikes;
	
	/**
	 * Detta är en konstruktor
	 */
	
	public BikeStore(){
		
	bikes  = new ArrayList<Bike>();
	}
	/** Returnerar info om cyklarna
	 * @return
	 */
	public String getAllBikes(){
		String myString = "";
		for(int i = 0;i < bikes.size();i++){
			myString += "Färg: " + bikes.get(i).getColor() +" Storlek " + bikes.get(i).getSize() + " Pris " + bikes.get(i).getPrice()+ "\n";
		}
		
		return myString;
	}
	/** Ger värden till färg, pris och storlek
	 * @param color
	 * @param price
	 * @param size
	 */
	public void addBike(String color, int price, int  size){

		Bike bike = new Bike(color, price, size);
		bikes.add(bike);
	}
}

	