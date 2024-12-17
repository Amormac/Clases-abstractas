package ec.edu.puce.clasesAbstractas;

public class Circulo extends FiguraGeometrica{
	private double radio;

	public Circulo(String nombreFigura, double radio) {
		super(nombreFigura);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return 3.1416 * (radio * radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
}
