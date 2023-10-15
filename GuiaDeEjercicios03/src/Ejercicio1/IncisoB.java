package Ejercicio1;

public class IncisoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberA = 95;
		int numberB = 45;
		int numberC = 14;
		
		boolean decreciente = false;
		
		if(decreciente)
		{
			if(numberA > numberB && numberA > numberC) {
				System.out.println(numberA);
				if(numberB > numberC) {
					System.out.println(numberB);
					System.out.println(numberC);
				}
				else {
					System.out.println(numberC);
					System.out.println(numberB);
				}
			}
			
			else if(numberB > numberA && numberB > numberC) {
				System.out.println(numberB);
				if(numberA > numberC) {
					System.out.println(numberA);
					System.out.println(numberC);
				}
				else {
					System.out.println(numberC);
					System.out.println(numberA);
				}
			}
			
			else if(numberC > numberB && numberC > numberA) {
				System.out.println(numberC);
				if(numberB > numberA) {
					System.out.println(numberB);
					System.out.println(numberA);
				}
				else {
					System.out.println(numberA);
					System.out.println(numberB);
				}
			}
			else {
				System.out.println(numberA + "\n" + numberB + "\n" + numberC);
			}
		}
		else 
		{
			if(numberA < numberB && numberA < numberC) {
				System.out.println(numberA);
				if(numberB < numberC) {
					System.out.println(numberB);
					System.out.println(numberC);
				}
				else {
					System.out.println(numberC);
					System.out.println(numberB);
				}
			}
			
			else if(numberB < numberA && numberB < numberC) {
				System.out.println(numberB);
				if(numberA < numberC) {
					System.out.println(numberA);
					System.out.println(numberC);
				}
				else {
					System.out.println(numberC);
					System.out.println(numberA);
				}
			}
			
			else if(numberC < numberB && numberC < numberA) {
				System.out.println(numberC);
				if(numberB < numberA) {
					System.out.println(numberB);
					System.out.println(numberA);
				}
				else {
					System.out.println(numberA);
					System.out.println(numberB);
				}
			}
			else {
				System.out.println(numberA + "\n" + numberB + "\n" + numberC);
			}
		}
	}

}
