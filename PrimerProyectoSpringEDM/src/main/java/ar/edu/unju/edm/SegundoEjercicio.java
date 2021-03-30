package ar.edu.unju.edm;

public class SegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altura;
		int base;
		
		altura=10;
		base=20;
		Rectangulo unRectangulo = new Rectangulo();
		int resultado =unRectangulo.CalcularSuperficie(base, altura);
		int resultado1=unRectangulo.CalcularPerimetro(base,altura);
		
		System.out.println("La superficie del rectangulo es= "+resultado);
		System.out.println("El perimetro del rectangulo es= "+resultado1);
	}

}
