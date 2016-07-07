package Excercise3;

public class ex3_1 {
	private String girlName;
	
	//CREATING CONSTRUCTOR
	//If we're working in a class called ex3_1, then our constructor
	//must also be called ex3_1
	
	public ex3_1(String name) {
		girlName = name;
	}
	
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s", getName());
	}
}
