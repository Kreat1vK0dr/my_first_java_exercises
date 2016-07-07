import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		// [] after variable name tells java you want an array.
		//if you want to hard code after the fact
		//int number[]  = new int[10];
		//number[0] = 1;
		//number[1] = 2;
		//AUTOMATED
		int number[] = {34,56,4,125,9,29};
		System.out.println("Index\tValue");
		int sum=0;
		for(int counter=0; counter<number.length;counter++){
			System.out.println(counter+"\t"+number[counter]);
			sum+=number[counter];
		}
		System.out.println(sum+"");

	
	Random rand = new Random();
	int freq[] = new int[7];
	
	for (int roll=1;roll<1000;roll++){
		++freq[1+rand.nextInt(6)];
	}
	
	System.out.println("Face\tFrequency");
	
	for(int face=1;face<freq.length;face++) {
		System.out.println(face+"\t"+freq[face]);
	}
	//ENHANCED FOR LOOP
	int total = 0;
	for(int x: number){
		total+=x;
	}
	System.out.print(total);
	}
}
