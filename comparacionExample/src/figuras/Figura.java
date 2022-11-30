/**
 * @author yelose
 * Clase madre Figures
 */
package figuras;

/**
 * @author mgonza22
 */

public abstract class Figura implements Comparable<Figura>{
	private String nombre;
	private static int cantidadDeFiguras;
		
	//constructors
	public Figura() {
		super();
		cantidadDeFiguras ++;
	}
		
	public Figura(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public static int getCantidadDeFiguras() {
		return cantidadDeFiguras;
	}

	public static void clear() {
		cantidadDeFiguras = 0;
	}
		
	//accessors
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos de negocio
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();

	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if (obj instanceof Figura) {
			Figura fig = (Figura)obj;
			bln = fig.getNombre() !=null && fig.getNombre().equals(nombre);
		}
		return bln;
	}

	@Override
	public int hashCode() {
		return nombre==null?0:nombre.hashCode();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append(nombre);
		return sb.toString();
	}

	@Override
	public int compareTo(Figura o) {
		return (-1)*nombre.compareTo(o.getNombre());
	}	
}
