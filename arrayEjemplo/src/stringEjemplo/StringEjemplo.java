package stringEjemplo;

public class StringEjemplo {

	public static void main(String[] args) {
	
			String saludos[] = {
					new String("Hola"),
					new String("Adiós"),
					new String("Hello"),
					new String("Goodbye")
			};
			String tmp = saludos[2];
			
			for (int i = 0; i < saludos.length; i++) {
				System.out.println("la posición " + i + ": " + saludos[i]);
			}
	}
}
