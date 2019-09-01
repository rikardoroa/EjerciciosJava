package calculotriangulo;



public class GettersAndSettersTriangulo {
	

	private int Base;
	private int Altura;
	
	
	public int getBase() {
		if (Base>=10) {
			return 0;
		}
		else { 
		return Base;
		}
	}

	
	public int getAltura() {
		return Altura;
	}

	
	public void setBase(int Base) {
		
		this.Base=Base;
	}
	
	public void setAltura(int Altura) {
		this.Altura=Altura;
	}
	
	public int Calcular() {
		
		int Calcular= Base * Altura /2;
		return Calcular;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   GettersAndSettersTriangulo CalculoT = new GettersAndSettersTriangulo();
       CalculoT.setBase(5);
       CalculoT.setAltura(10);
       int Calcular = CalculoT.Calcular();
       int Base = CalculoT.getBase();
       System.out.println("el area del triangulo es:"+Calcular);
       System.out.println("la base del triangulo es:"+Base);
	}

}
