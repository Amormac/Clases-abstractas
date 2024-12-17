package ec.edu.puce.clasesAbstractas;

public abstract class FiguraGeometrica {
	private String nombreFigura;
	
	public FiguraGeometrica(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public abstract double calcularArea();
	
	public Boolean mayorQue (FiguraGeometrica figura) {
		return this.calcularArea() > figura.calcularArea();
		
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	
	

}
