package escribetxtFinput;


import java.io.*;

public class Escribetxt {
	
	
void EscribirmiTxT(){
		
		try{
		FileOutputStream Escribe = new FileOutputStream("D:\\fichero.txt");
		String Cadena="Ricardo Roa";
		
		byte GuardaCadena[]=Cadena.getBytes();
		
		Escribe.write(GuardaCadena, 0, GuardaCadena.length);
		
		Escribe.close();
		
	        System.out.println("Proceso Exitoso al escribir el archivo");
	    
		}catch(IOException e){
		 System.out.println("Ocurrio un error al escribir el archivo");	
		}
	}
	
	

	public static void main(String[] args) {
		Escribetxt escribirmitxt = new Escribetxt();
		escribirmitxt.EscribirmiTxT();

	}

}
