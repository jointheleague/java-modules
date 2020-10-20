package _05_Pseudo_RNG;

public class PseudoRNG {
	/*
	 * It is impossible for a computer to come up with a series of numbers 
	 * that are truly random. They can, however, use mathematical algorithms
	 * to generate numbers that can seem random. These are called pseudo random 
	 * numbers.
	 * 
	 */
	
	
	// This is called the xor shift. It is a very simple algorithm to generate
	// Pseudo random numbers. 
	long xorShift(long seed){
		//1. Shift seed to the left 13 bits and save the result
		
		//2. xor shift seed by the result of step 1 and save that result
		
		//3. Set seed equal to the result of step 2
	
		//4. Shift seed to the right 7 bits and save the result
		
		//5. xor shift seed by the result of step 4 and save that result
				
		//6. Set seed equal to the result of step 5
		
		//7. Shift seed to the left 17 bits and save the result
		
		//8. xor shift seed by the result of step 7 and save that result
				
		//9. Set seed equal to the result of step 8
		
		//10. change the line below to return seed
		return 0;
		
		//For fun, see if you can rewrite the method using only 4 lines of code
	}
	
	//12. Write your own pseudo random generation method. You can use the xor
	//    shift as a guide. Use the main method to test it.
	
	public static void main(String[] args) {
		// 11. Test out your xorShift method here. You can
		//     use System.currentTimeMillis as the seed to get
		//     different results each run.
	}
}


