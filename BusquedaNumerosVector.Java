import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	int[] ArraysDeEnteros = new int[] { 1, 2, 3, 4 };
    int[] ArraysDeEntero =  new int[] { 2, 4, 6, 8, 10 };
    
   	public void encuentraentero (){
   	
   	    System.out.println("----Vector A---");
   	    for (int i=0;i<ArraysDeEnteros.length; i++){
   	    	 	System.out.println (ArraysDeEnteros[i]);
   	    }
   	    
   	    System.out.println("----Vector B----");
   	    
   	     for (int k=0;k<ArraysDeEntero.length; k++){
   	    	 	System.out.println (ArraysDeEntero[k]);
   	    }
   		
   		System.out.println("---Resultado de la comparacion--");
   		
   		
       	for (int i=0; i<ArraysDeEnteros.length; i++){
       	 for (int k=0;k<ArraysDeEntero.length; k++){
   			    if(ArraysDeEntero[k]==ArraysDeEnteros[i]){
   			 	System.out.println ("el Numero Encontrado es:"+ArraysDeEnteros[i]);
   			 	
   			 } 
   			
   		}  
   		
      }
      
   	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Ideone encuentra = new Ideone();
		encuentra.encuentraentero();
	}
}
