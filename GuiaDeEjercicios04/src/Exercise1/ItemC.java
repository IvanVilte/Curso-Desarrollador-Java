package Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ItemC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer numbers [] = ingresoNumeros(args, scanner);
		boolean ascendente = ingresoOrden(args, scanner);
		
		scanner.close();
		
		if(ascendente)
			Arrays.sort(numbers);
		else
			Arrays.sort(numbers, Collections.reverseOrder());
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
	
	public static boolean ingresoOrden(String [] args, Scanner scanner)
	{
		boolean ascendente;
		
		if(args.length == 0) {
			
			System.out.println("¿Como desea ordenar la números?(0-Ascendente, 1-Descendente)");
			int opcion = scanner.nextInt();
			
			if(opcion == 0)
				ascendente = true;
			else
				ascendente = false;
		}
		else
		{
			if(args[3].charAt(0) == 'A')
				ascendente = true;
			else
				ascendente = false;
		}
		
		return ascendente;
	}
	public static Integer[] ingresoNumeros(String [] args, Scanner scanner) {
		Integer numbers [] = new Integer [3];
		
		if(args.length == 0)
		{
			
			System.out.println("Ingrese un número: ");
			numbers[0] = scanner.nextInt();
			System.out.println("Ingrese otro número: ");
			numbers[1] = scanner.nextInt();
			System.out.println("Ingrese otro número: ");
			numbers[2] = scanner.nextInt();
			
		}
		else
		{
			numbers[0] = Integer.parseInt(args[0]);
			numbers[1] = Integer.parseInt(args[1]);
			numbers[2] = Integer.parseInt(args[2]);
		}
		
		return numbers;
	}

}
