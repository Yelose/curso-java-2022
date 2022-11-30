package es.edu.capgemini.piedrapapeltijera.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
	public static final int PIEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TIJERA = 3;
	
	static List<PiedraPapelTijeraFactory> elementos;

	protected String descripcionResultado;
	protected String nombre;
	protected int numero;
	
	public PiedraPapelTijeraFactory(int pNumero, String pNombre) {
		super();
		this.numero = pNumero;
		this.nombre = pNombre;
	}

	public String getDescripcionResultado() {return descripcionResultado;}

	public String getNombre() 				{return nombre;}
	public void setNombre(String nombre) 	{this.nombre = nombre;}

	public int getNumero() 					{return numero;}
	public void setNumero(int numero) 		{this.numero = numero;}
	
	public abstract boolean isMe (int pNumero);
	public abstract int comparar( PiedraPapelTijeraFactory pPiedraPapelTijera);
	
	public static PiedraPapelTijeraFactory getInstance(int pNumero) {
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if(piedraPapelTijeraFactory.isMe(pNumero))
				return piedraPapelTijeraFactory;
		}
		return null;
	};
}
