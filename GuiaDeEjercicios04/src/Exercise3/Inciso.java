package Exercise3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Inciso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String archivoEntrada = args[0];
		String archivoSalida = args[1];
		int encode = Integer.parseInt(args[2]);
		int desplazamiento = Integer.parseInt(args[3]);
		
		System.out.println();
		if(!Files.exists(Paths.get(archivoEntrada))) {
			System.out.println("El programa no terminó de manera correcta. El archivo de entrada no existe.");
		}
		else {
			
			obtenerFile(archivoSalida);
			
			modificarArchivo(archivoEntrada, archivoSalida, desplazamiento, encode);
			
			System.out.println("El programa terminó correctamente.");
		}
	}
	public static void modificarArchivo(String archivoEntrada, String archivoSalida,int desplazamiento, int encode) {
		byte [] lineEncode;
		try {
			FileWriter escribir = new FileWriter(archivoSalida, true);
			for (String line : Files.readAllLines(Paths.get(archivoEntrada))) {
				lineEncode = codificar(line);
				desplazamiento(lineEncode, desplazamiento, encode);
				escribir.write(decodificar(lineEncode) + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void obtenerFile(String direccion)
	{
		try {
			if(!Files.exists(Paths.get(direccion)))
				Files.createFile(Paths.get(direccion));
			else
			{
				BufferedWriter bw;
					bw = new BufferedWriter(new FileWriter(direccion));
					bw.write("");
					bw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static byte[] codificar(String line) 
	{
		return line.getBytes();
	}
	public static void desplazamiento(byte[] line, int desplazamiento, int encode)
	{
		if(encode == 0)
		{
			for (int i = 0; line.length > i; i++) {
				line[i] = (byte) (line[i] + desplazamiento);
			}
		}
		else
		{
			for (int i = 0; line.length > i; i++) {
				line[i] = (byte) (line[i] - desplazamiento);
			}
		}
	}
	public static String decodificar(byte[] line)
	{
		return new String(line);
	}
}
