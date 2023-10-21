package Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ItemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer numbers [] = new Integer [3];
		short order;
		
		System.out.println("Ingrese un número: ");
		numbers[0] = scanner.nextInt();
		System.out.println("Ingrese otro número: ");
		numbers[1] = scanner.nextInt();
		System.out.println("Ingrese otro número: ");
		numbers[2] = scanner.nextInt();
		
		System.out.println("¿Como desea ordenar la números?(0-Ascendente, 1-Descendente)");
		order = scanner.nextShort();
	
		scanner.close();
		
		if(order == 0)
		{
			Arrays.sort(numbers);
		}
		else
		{
			Arrays.sort(numbers, Collections.reverseOrder());
		}
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}
