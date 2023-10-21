package Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Inciso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer result = 0;
		try {
			
			for (String line : Files.readAllLines(Paths.get(args[0]))) {
				for (String number : line.split(",")) {
					result += Integer.parseInt(number);
				}
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
	}

}
