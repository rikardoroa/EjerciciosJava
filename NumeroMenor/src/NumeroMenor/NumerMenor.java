

package NumeroMenor;
import  java.util.Scanner;


public class NumerMenor {

	
	int numa;
	int numb;
	
	void leernumeros() {
		
    Scanner LecturaDatos = new Scanner(System.in);
    System.out.println( "Digite el primer numero:");
    numa=Integer.parseInt(LecturaDatos.nextLine());
    System.out.println( "Digite el segundo numero:");
    numb=Integer.parseInt(LecturaDatos.nextLine());
    LecturaDatos.close();
	}
	
	void Comparar() {
	 if(numa<numb) {
		 System.out.println( "el numero menor es:"+numa);
	 }
	 else {
		 System.out.println("el numero menor es:"+numb);
	 }
	}
	
	
	
	
	public static void main(String[] args) {
		
      NumerMenor leer = new NumerMenor();
      leer.leernumeros();
      leer.Comparar();
	}

}
