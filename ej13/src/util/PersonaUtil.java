package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public abstract class PersonaUtil {
	
	public static Map<Integer, Persona> getPersonas(List<Persona>personasList){
		Map<Integer, Persona> mapPersonas = new HashMap<Integer, Persona>();
		Iterator<Persona> it = personasList.iterator();
		Persona persona = null;
		
		while (it.hasNext()) {
			persona = it.next();
			mapPersonas.put(persona.getExp(), persona);			
		}
		
		return mapPersonas;
	}
	
	public static TreeSet<Persona> ordenarPersonas(List<Persona> personasDesordenadas){
		TreeSet<Persona> personasTree= new TreeSet<Persona>();
		for (Persona persona : personasDesordenadas) {
			personasTree.add(persona);
		}
		return personasTree;		
	}
}
