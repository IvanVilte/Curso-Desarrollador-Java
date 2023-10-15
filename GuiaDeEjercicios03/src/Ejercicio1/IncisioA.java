package Ejercicio1;

public class IncisioA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "Hola que tala";
		char letra = 'a';
		int apariciones = 0;
		
		for (int i = 0; i < palabra.length(); i++) {
			if( letra == palabra.charAt(i)) {
				apariciones++;
			}
		}
		
		System.out.println("La cantidad de apariciones de la letra en el String es: " + apariciones);
	}
}
