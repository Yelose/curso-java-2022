package figuras;

public class Circulo extends Figura {
	private float radio;
	
	public Circulo() {};

	public Circulo(String nombre, float paramRadio) {
		super();
		this.radio = paramRadio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		return 2* (float)Math.PI * radio;
	}

	@Override
	public float calcularSuperficie() {
		return (float)Math.PI * (float)Math.pow(radio, 2);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) 
			&& obj instanceof Circulo 
			&& ((Circulo)obj).getRadio() == radio;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int)radio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", radio=");
		sb.append(radio);
		return sb.toString();
	}
	

}
