package ec.edu.puce.clasesAbstractas;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica rectangulo1 = new Rectangulo(20,10,"rectangulo 1");
		FiguraGeometrica rectangulo2 = new Rectangulo(15,5,"rectangulo 2");
		imprimirArea(rectangulo1);
		imprimirArea(rectangulo2);
		imprimirMayor(rectangulo1, rectangulo2);
		
		FiguraGeometrica triangulo1 = new Triangulo(10,5,"triangulo 1");
		FiguraGeometrica triangulo2 = new Triangulo(4,10,"triangulo 2");
		imprimirArea(triangulo1);
		imprimirArea(triangulo2);
		imprimirMayor(triangulo1, triangulo2);
		
		FiguraGeometrica circulo1 = new Circulo("circulo 1",4);
		FiguraGeometrica circulo2 = new Circulo("circulo 2",8);
		imprimirArea(circulo1);
		imprimirArea(circulo2);
		imprimirMayor(circulo1, circulo2);
		
	}
	
	public static void imprimirMayor(FiguraGeometrica figura1, FiguraGeometrica figura2) {
		if(figura1.mayorQue(figura2)) {
			System.out.println("La figura " + figura1.getNombreFigura() + " es mayor que la figura " + figura2.getNombreFigura());
		}
		else {
			System.out.println("La figura " + figura2.getNombreFigura() + " es mayor que la figura " + figura1.getNombreFigura());
		}
		System.out.println("\n");
	}
	
	public static void imprimirArea(FiguraGeometrica figura) {
		System.out.println("El area de " + figura.getNombreFigura() + " es: " + figura.calcularArea());
	}

}
