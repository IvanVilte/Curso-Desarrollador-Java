package Ejercicio2;

public class IncisoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hola que tal";
		byte[] textEncode = text.getBytes();
		
		for (int i = 0; textEncode.length > i; i++) {
			textEncode[i] = (byte) (textEncode[i] + 1);
		}
		
		System.out.println("Texto sin desplazamiento: " + text);
		
		text = new String(textEncode);
		
		System.out.println("Texto con desplazamiento: " + text);
	}

}
