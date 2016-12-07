package main;

import java.io.File;
import java.io.IOException;

public class Crear {

	public void crearDirectorio(File archivo, String nombre){
		File carpeta = new File(archivo,nombre);
		carpeta.mkdir();
	}
	
	public void crearArchivo(File archivo, String nombre) throws IOException{
		File archivo1 = new File(archivo,nombre);
		archivo1.createNewFile();
	}
	
	public void eliminar(File archivo){
		archivo.delete();
	}
	
	public String isOculto(File archivo){
		if(archivo.isHidden())
			return "Este archivo esta oculto";
		else
			return "Este archivo es visible";
	}
}
