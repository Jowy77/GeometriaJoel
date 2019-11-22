package dad.Lambda;

public class Main {
	
	public static void main(String [] args) {
		
	
		Operador suma = (a,b)-> a+b;
		Operador restador = (a,b) -> a-b;
		//Negador negador = a -> -a;
		
		calcular(13,14,(n,m)->n*2*m);
		
		//int r = sumador.operar(10,4);
		//int v = negador.negar(45);
		
		//System.out.println(r);
		//System.out.println(v);
		
	}
	
	
	public static void calcular(double x,double y , Operador op) {
		System.out.println(op.operar(x,y));
	}

}
