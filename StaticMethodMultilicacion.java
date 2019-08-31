import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OperacionEnteros
{
   static int a= 2;
   static int b=2;
   static int multiplicacion;
   
   public static int  multiplica(int a, int b, int multiplicacion){
   	
   	multiplicacion = a * b;
   	return (multiplicacion);
   	
   }
	
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
	     OperacionEnteros calcula = new OperacionEnteros();
	     System.out.println("El resultado de la multiplicacion es:" +OperacionEnteros.multiplica(a, b, multiplicacion));
	}
}
