import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args){
	
	
	ArrayList<Bike> bikeList = new ArrayList<Bike>();
			bikeList.add(new Bike("blå", 20, 32000));
			bikeList.add(new Bike("röd", 15, 6000));
			bikeList.add(new Bike("grön", 6,2000));
			bikeList.add(new Bike("vit", 12, 5600));
			bikeList.add(new Bike("brun", 7,80000));
			bikeList.add(new Bike("svart", 29, 6000));
			bikeList.add(new Bike("röd", 6,2000));
			bikeList.add(new Bike("gul", 16, 7000));
			bikeList.add(new Bike("vit", 15,45000));
			bikeList.add(new Bike("rosa", 30,2000));
			
			for(Bike b:bikeList){
				System.out.println("Cykel nr "+bikeList.indexOf(b)+ " är "+b.getColor()+ " och kostar "+b.getPrice()+ " kr och är "+b.getSize()+" tum stor");
			}

}

}
