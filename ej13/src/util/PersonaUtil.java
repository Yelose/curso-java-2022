package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PersonaUtil {
	
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
}
