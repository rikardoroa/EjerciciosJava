package vectorproducto;
import javax.swing.JOptionPane;

public class VectorProducto {

	
	public int TamA;
	public int Tamb;
	int i;
	int j;
	int x;
	String  input;
	String  inputb;
	int aux;
	int auxy;
	int multiplicacion;
	int contador=0;
	int opcion;
	
	    public void CapturaDatosA() {
	    	
		TamA=Integer.parseInt(JOptionPane.showInputDialog("Digite el Tamaño del primer Vector"));
		JOptionPane.showMessageDialog(null,"el Tamaño del primer Vector fue:"+TamA);
		Tamb=Integer.parseInt(JOptionPane.showInputDialog("Digite el Tamaño del Segundo Vector"));
		JOptionPane.showMessageDialog(null,"el Tamaño del Segundo Vector fue:"+Tamb);
		
	    }
	


	    public void InsertaDatosEnVector()
	{
	   
	    int VectorA []= new int [TamA];
		int Vectorb []= new int [Tamb];
		
		int intentos=0;
	    do {
		if(VectorA.length!=Vectorb.length) {
		
		JOptionPane.showMessageDialog(null,"No se pueden realizar las operaciones ya que los vectores no tienen el mismo tamaño, vuelva a intentarlo");
			
		}
		else {
			
			    for(i=0;i<VectorA.length;i++) {
				
			    input=(JOptionPane.showInputDialog("Digite los numeros para el primer vector:"));
			    aux=Integer.parseInt(input);
		        VectorA[i]=aux;
				
				}
				
				for(j=0;j<Vectorb.length;j++) {
					
				inputb=(JOptionPane.showInputDialog("Digite los  numeros para el segundo vector:"));
				auxy=Integer.parseInt(inputb);
		        Vectorb[j]=auxy;
		        
			    }

					
			    for(i=0;i<VectorA.length;i++) {
			    
			    JOptionPane.showMessageDialog(null,"los numeros del primer vector fueron:"+VectorA[i]);
			    
			    }
			    	
			    for(j=0;j<Vectorb.length;j++) {
				
			    JOptionPane.showMessageDialog(null,"los numeros del segundo vector fueron:"+Vectorb[j]);
				
			    }
			    	
			    for(i=0;i<VectorA.length;i++) {
				for(j=0;j<Vectorb.length;j++) {
				multiplicacion=VectorA[i]*Vectorb[j];
		        JOptionPane.showMessageDialog(null,"la multiplicacion de los  vectores fue:"+multiplicacion);
				contador=contador +1;
			    }
			    }
			    
			    int Vectorx []= new int [contador];	
			    for(i=0;i<VectorA.length;i++) {
				for(j=0;j<Vectorb.length;j++) {
					
			    multiplicacion=VectorA[i]*Vectorb[j];
				Vectorx[x]=multiplicacion;
				JOptionPane.showMessageDialog(null,"el numero del nuevo vector es:"+Vectorx[x]); 
			
			    
			    }
				 
			    
				}
			    
		        }
		     intentos=intentos+1;
	    }while (intentos<4);
	    
		      
		      
	    
	}
	    
	 		
	
	    
	public static void main(String[] args) {
		
		VectorProducto Mostrar = new VectorProducto();
		Mostrar.CapturaDatosA();
        Mostrar.InsertaDatosEnVector() ;
     
        
	}

}
