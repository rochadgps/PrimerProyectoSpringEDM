package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerProyectoSpringEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringEdmApplication.class, args);
		
		System.out.println("hola mundo, soy Cristian");
		
		double a;
		double b;
		a=5;
		b=10;
		
		System.out.println("La multiplicacion de a + b es= "+ a*b);
		System.out.println("El resultado de la suma es= "+ sumar(a,b));
	}
	public static double sumar(double a,double b) {
		return a+b;
	}

}
