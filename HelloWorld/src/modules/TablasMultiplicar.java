package modules;

public class TablasMultiplicar {

	public static void main(String[] args) {
        for (int numeroDeTabla = 1; numeroDeTabla <= 10; numeroDeTabla++) {
            imprimirTabla(numeroDeTabla);
            System.out.println(" ");
        }
    }

    public static void imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
    }
}
