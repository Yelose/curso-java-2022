package figuras;

import figuras.exceptions.FiguraException;

public class Cuadrado extends Figura {
	
	private float lado;
	
	public Cuadrado() {}
	
	public Cuadrado(String paramNombre, float paramLado) throws FiguraException {
		super(paramNombre);
		setLado(paramLado);
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) throws FiguraException {
		if (lado < 0) {
			throw new FiguraException("el valor del lado no puede ser negativo, no tiene sentido");
		}
		this.lado = lado;
	}

	@Override
	public float calcularPerimetro() {
		return lado*4;
	}

	@Override
	public float calcularSuperficie() {
		return lado*lado;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 
			&& obj instanceof Cuadrado 
			&& ((Cuadrado)obj).getLado() == lado;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)lado;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado=");
		sb.append(lado);
		return sb.toString();
	}

}
