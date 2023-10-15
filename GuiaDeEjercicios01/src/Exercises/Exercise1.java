package Exercises;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberA = 5;
		int numberB = 14;
		boolean pares = true;
		
		while (numberA <= numberB) {
			if(pares) {
				if(numberA % 2 == 0)
					System.out.println(numberA);
			}
			else {
				if(numberA % 2 != 0)
					System.out.println(numberA);
			}
			numberA++;
		}
		
		for(;numberA <= numberB; numberB--) {
			if(numberB % 2 == 0)
				System.out.println(numberB);
		}
	}

}
