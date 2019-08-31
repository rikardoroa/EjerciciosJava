import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Escribetxt
{
	
	void EscribirmiTxT(){
		
		try{
		FileOutputStream Escribe = new FileOutputStream("D:\\fichero.txt");
		String Cadena="RicardoRoa";
		
		byte GuardaCadena[]=Cadena.getBytes();
		Escribe.write(GuardaCadena, 0, GuardaCadena.length);
		Escribe.close();
		}catch(IOException e){
		 System.out.println("Ocurrio un error al escribir el archivo");	
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Escribetxt escribirmitxt = new Escribetxt();
		escribirmitxt.EscribirmiTxT();
	}
}
