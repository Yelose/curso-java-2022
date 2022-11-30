package modules;

public enum Planeta {
	MERCURIO("Mercurio", 3.303e+23, 2.4397e6), 
	VENUS("Venus", 4.869e+24, 6.0518e6), 
	TIERRA("Tierra", 5.976e+24, 6.37814e6), 
	MARTE("Marte", 6.421e+23, 3.3972e6), 
	JUPITER("Júpiter", 1.9e+27, 7.1492e7), 
	SATURNO("Saturno", 5.688e+26, 6.0268e7), 
	URANO("Urano", 8.688e+26, 2.559e7), 
	NEPTUNO("Neptuno", 1.024e+26, 2.4746e7);
	
	private String nombre;
	private double masa;
	private double radio;
	
	private Planeta(String nombre, double masa, double radio) {
		this.nombre = nombre;
		this.masa = masa;
		this.radio = radio;
	}
	

}


