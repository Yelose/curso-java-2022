package es.edu.capgemini.piedrapapeltijera.modelo;

public class Papel extends PiedraPapelTijeraFactory {

	public Papel() {
		this(PAPEL, "papel");
	}
	public Papel(int pNumero, String pNombre) {
		super(pNumero, pNombre);
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == PAPEL;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		
		switch(numeroRecibido) {
		case PAPEL:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		
		case PIEDRA:
			result = 1;
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijera.getNombre();
			break;
			
		case TIJERA:
			result = -1;
			descripcionResultado = nombre + " pierde contra " + pPiedraPapelTijera.getNombre();
			break;
		}
		
		return result;
	}
}
