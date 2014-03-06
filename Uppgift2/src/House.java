
public class House {
	private int year;
	private int size;
	private static int nbrOfHouses = 0;
	public static final int MIN_SIZE =10;
	public House(int _year,int _size){
	
		year = _year;
		if(_size < MIN_SIZE){
			size = MIN_SIZE;
		}else{
			size = _size;
		}
		nbrOfHouses ++;
	}
		
	public static int getNbrHouses(){
		return nbrOfHouses;
	}
	public int getYear(){
		return this.year;
	}
	public int getSize(){
		return this.size;
	}
}
