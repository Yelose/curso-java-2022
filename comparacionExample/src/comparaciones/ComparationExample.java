package comparaciones;

import java.util.Set;
import java.util.TreeSet;

import figuras.Cuadrado;
import figuras.Figura;

import figuras.exceptions.FiguraException;

public class ComparationExample {

	public static void main(String[] args) throws FiguraException {
		Set<String> listNames = new TreeSet<>();
		listNames.add(new String("Marta"));
		listNames.add(new String("Marina"));
		listNames.add(new String("Patricia"));
		listNames.add(new String("Viviana"));
		listNames.add(new String("Cristina"));
		listNames.add(new String("Lucy"));
		listNames.add(new String("Nerea"));
		listNames.add(new String("Paz"));
		listNames.add(new String("Gabriel"));
		
		int i=1;
		for (String nombre : listNames) {
			System.out.println(i++ + " nombre: " + nombre);
		}
		Set<Figura> figuras = new TreeSet<Figura>();
		figuras.add(new Cuadrado("Cuadradito", 10));
		figuras.add(new Cuadrado("Cuadrado", 10));
		figuras.add(new Cuadrado("Pentágono", 10));
		figuras.add(new Cuadrado("Hexágono", 10));
		figuras.add(new Cuadrado("Línea", 10));
		figuras.add(new Cuadrado("Triángulo", 10));
		figuras.add(new Cuadrado("Círculo", 10));
		
		int e=1;
		for (Figura nombre : figuras) {
			System.out.println(e++ + " nombre: " + nombre);
		}

	}

}
