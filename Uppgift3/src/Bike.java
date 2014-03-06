public class Bike {
private String color;
private int price;
private int size;
private static int nbrOfBikes;
/**
 * Detta är en konstruktor
 * @param color1 Färg
 * @param size1 Storlek
 */
public Bike(String color1, int size1){
	if(size1 > Constants.MIN_SIZE && size1 < Constants.MAX_SIZE){
	this.color = color1;
	this.size = size1;
	nbrOfBikes ++;
	}
}
/**
 * Detta är också en konstruktor
 * @param color1 Färg
 * @param size1 Storlek
 * @param price1 Pris
 */
public Bike(String color1, int size1, int price1){
	boolean legit = false;
	if(size1 > Constants.MIN_SIZE && size1 < Constants.MAX_SIZE){
	this.size = size1;
	}
	if(price1 > Constants.MIN_PRICE && price1 < Constants.MAX_PRICE){
	this.price = price1;
	}
	for(int i = 0; i < Constants.OK_COLOR.length; i++){
		if(Constants.OK_COLOR[i] == color1){
			legit = true;
		}
	if(legit == true){
		this.color = color1;
	nbrOfBikes ++;
	}
	
	}
}
	


/**
 * @return Returnerar cykelns färg
 */
public String getColor(){
	return this.color;
}
/**
 * @return Returnerar cykelns storlek
 */
public int getSize(){
	return this.size;
}
/**
 * @return Returnerar cykelns pris
 */
public int getPrice(){
	return this.price;
}
/**
 * @return Returnerar antal cyklar
 */
public static int getNumberOfBikes(){
	return nbrOfBikes;
}
}




