public class hund extends mamal{
	private boolean stupid;
	
public hund (String latinName, int nursingTime, boolean stupid) {
		
		super(latinName, nursingTime);
		this.stupid =stupid;
		}
public boolean stupid(){
	return stupid;
}


public String getInfo() {
	String s;
	if (stupid){
		s ="" ;
	}else{
		s = " not ";
	}
	return " The dog \" " + super.getLatinName() +"\" nurses for "
			+super.getnursingTime() + " months and is" + s + " stupid." ;
}

}
