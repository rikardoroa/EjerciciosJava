

package Vector;

import javax.swing.JOptionPane;

public class Vector {
	
   int[] numeros = new int[4];
   int i;
   int k;
   int auxiliar;
   int contador=0;

   
   
	public void vectorinicial(){
		numeros[0] =5;
		numeros[1] =2;
		numeros[2] =1;
		numeros[3] =8;
		
		
		for  (i=0; i<numeros.length;i++) {
			
			 System.out.println(numeros[i]);
			 JOptionPane.showMessageDialog( null, "el resultado es:"+numeros[i]);
		}
		 
	}

	
	public void intercambio(){
		numeros[0] =5;
		numeros[1] =2;
		numeros[2] =1;
		numeros[3] =8;
		
		 for(k=0;k<numeros.length-1;k++) { 
		   for  (i=0; i<numeros.length-1;i++) {
			 if (numeros[i]<numeros[i+1]){
                 auxiliar=numeros[i];
                 numeros[i]=numeros[i+1];
                 numeros[i+1]=auxiliar;
                 
             }
				
		}
		 
	}
		 
}
		
		
	
 public	void imprimir() {
	 
	 for  (i=0; i<numeros.length;i++) {
		 
	 System.out.println(numeros[i]);
	 JOptionPane.showMessageDialog( null, "el resultado es:"+numeros[i]);
	}
}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector Recorrido = new Vector();
      Recorrido.vectorinicial();
      Recorrido.intercambio();
      Recorrido.imprimir();
      
	}

}
