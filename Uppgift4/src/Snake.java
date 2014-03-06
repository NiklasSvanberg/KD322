public class Snake extends Animal {

	private boolean poisonous;
	
	public Snake (String latinName, boolean poisonous) {
		
		super (latinName);
		this.poisonous = poisonous;
		}
	
	@Override
	public String getInfo() {
		String s;
		if (poisonous){
			s ="" ;
		}else{
			s = " not ";
		}
		return " The snake \"" + super.getLatinName() +"\" is " + s + "poisonous." ;
	}
}
