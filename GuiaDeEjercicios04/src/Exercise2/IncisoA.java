package Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IncisoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer result = 0;
		try {
			if(args[1].charAt(0) == '+') {
				for (String line : Files.readAllLines(Paths.get(args[0]))) {
					result += sumar(",", line);
				}
			}
			else {
				result = multiplicar(",", args[0]);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
	}
	
	public static Integer sumar(String separador, String numeros) {
		Integer sum = 0;
		
		for(String number: numeros.split(separador)) {
			sum += Integer.parseInt(number);
		}
		
		return sum;
	}
	
	public static Integer multiplicar(String separador, String numeros) throws NumberFormatException, IOException {
		Integer prod = 1;
		String number [];
		for(String line : Files.readAllLines(Paths.get(numeros)))
		{
			number = line.split(separador);
			for(int i = 0; i < number.length; i++) 
			{
				prod *= Integer.parseInt(number[i]);
			}
		}
		
		return prod;
	}
}
