package Ejercicio1;

public class IncisoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[10];
		numbers[0] = 1;
		numbers[1] = 37;
		numbers[2] = 16;
		numbers[3] = 76;
		numbers[4] = 32;
		numbers[5] = 66;
		numbers[6] = 17;
		numbers[7] = 7;
		numbers[8] = 45;
		numbers[9] = 27;
		
		int numberX = 30;
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numberX < numbers[i]) {
				sum += numbers[i];
			}
		}
		
		System.out.println(sum);
	}

}
