



package Suma;

import javax.swing.JOptionPane;

public class Suma
{
	
   int a =2;
   int b=3;
   int r;
   
	public void Sumar () {
	r=a +b;
	System.out.println("el resultado es:"+r);	
	JOptionPane.showMessageDialog( null, "el resultado es:"+r);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Suma Resultado = new Suma();
      Resultado.Sumar();
	}

}