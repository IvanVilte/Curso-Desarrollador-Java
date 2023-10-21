package Exercise1;
import java.util.Arrays;
import java.util.Collections;

public class ItemA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer numbers [] = new Integer[3];
		numbers[0] = Integer.parseInt(args[0]);
		numbers[1] = Integer.parseInt(args[1]);
		numbers[2] = Integer.parseInt(args[2]);
		
		Character order = args[3].charAt(0);
		
		if(order.equals('A')) 
		{
			Arrays.sort(numbers);
		}
		else
		{
			Arrays.sort(numbers, Collections.reverseOrder());
		}
		
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
