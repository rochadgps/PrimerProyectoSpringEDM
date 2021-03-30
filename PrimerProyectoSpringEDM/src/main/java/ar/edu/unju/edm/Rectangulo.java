package ar.edu.unju.edm;

public class Rectangulo {
	int altura;
	int base;
	
	int superficie;
	
	public Rectangulo() {
		// TODO Auto-generated constructor stub
	}
	public int CalcularSuperficie(int base,int altura) {
		return base*altura;
	}
	public int CalcularPerimetro(int base,int altura) {
		return 2*base+2*altura;
	}
}
