package ec.edu.puce.clasesAbstractas;

public class Rectangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura, String nombreFigura) {
		super(nombreFigura);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
