package es.edu.capgemini.piedrapapeltijera.modelo;

public class Tijera extends PiedraPapelTijeraFactory {

	public Tijera() {
		this (TIJERA, "tijera");
	}
	
	public Tijera(int pNumero, String pNombre) {
		super(pNumero, pNombre);
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch(numeroRecibido) {
		case PAPEL:
			result = 1;
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijera.getNombre();
			break;
		
		case PIEDRA:
			result = -1;
			descripcionResultado = nombre + " pierde contra " + pPiedraPapelTijera.getNombre();
			break;
			
		case TIJERA:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		}
		return result;
	}

}
