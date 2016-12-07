package main;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File archivo1;
		File archivo2;
		File archivo3;
		File archivo4;
		File archivo5;
		Crear creando;

		archivo1 = new File("C:" + File.separator + "Users" + File.separator + 
				"Gerardo Shimokawa" + File.separator
				+ "Desktop" + File.separator + "JQuery");

		String[] nombres1 = archivo1.list();

		for (int i = 0; i < nombres1.length; i++) {
			archivo2 = new File(archivo1, nombres1[i]);
			if (archivo2.isDirectory()) {
				System.err.println(nombres1[i]);
				String[] nombres2 = archivo2.list();
				for (int j = 0; j < nombres2.length; j++) {
					System.out.println("    " + nombres2[j]);
				}
			} else {
				System.out.println(nombres1[i]);
			}
		}
		
		creando = new Crear();
		archivo3 = new File("C:/Users/Gerardo Shimokawa/Desktop/TXTJAVA/LeerCarpeta/JQuery");
		creando.crearDirectorio(archivo3,"CARPETA1");
		archivo4 = new File(archivo3,"CARPETA1");
		try {
			creando.crearArchivo(archivo4,"HolaMundo.txt");
		} catch (IOException e) { 
			System.out.println("No se puede crear el archivo");
		}
		archivo5 = new File(archivo4,"HolaMundo.txt");
		System.out.println(creando.isOculto(archivo4));
		creando.eliminar(archivo5);
	}
}
