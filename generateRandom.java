package New;

import java.util.Random;

public class generateRandom {

	public static void main(String[] args) {
		 Random rand = new Random(); 
		  
	        int rand_int1 = rand.nextInt(500); 
	        int rand_int2 = rand.nextInt(500); 
	        System.out.println("Random Integers: "+rand_int1); 
	        System.out.println("Random Integers: "+rand_int2); 
	  	}

}
