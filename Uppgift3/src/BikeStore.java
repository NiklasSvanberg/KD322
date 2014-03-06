import java.util.ArrayList;


/**
 * @author Niklas
 * Detta �r en klass
 */
public class BikeStore {

	private ArrayList<Bike> bikes;
	
	/**
	 * Detta �r en konstruktor
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
			myString += "F�rg: " + bikes.get(i).getColor() +" Storlek " + bikes.get(i).getSize() + " Pris " + bikes.get(i).getPrice()+ "\n";
		}
		
		return myString;
	}
	/** Ger v�rden till f�rg, pris och storlek
	 * @param color
	 * @param price
	 * @param size
	 */
	public void addBike(String color, int price, int  size){

		Bike bike = new Bike(color, price, size);
		bikes.add(bike);
	}
}

	