package Excercise3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//WITHOUT CONSTRUCTOR
		//ex3_1 object1 = new ex3_1();
		//WITH CONSTRUCTOR
		ex3_1 object1 = new ex3_1("Jana");
		System.out.println("Enter name of first gf here:");
		String name = input.nextLine();
		object1.setName(name);
		object1.saying();
	}

}
