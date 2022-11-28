package modules;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.set(1985, Calendar.JULY, 31);
	
	cal.add(Calendar.DATE, 1);

	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyy EEE");	
	System.out.println("La fecha de nacimiento de Marina es " + sdf.format(cal.getTime()));
	
	System.out.println("datos a obtener");
	System.out.println("Año: " + cal.get(Calendar.YEAR));	
	System.out.println("Mes: " + cal.get(Calendar.MONTH));	
	System.out.println("Día: " + cal.get(Calendar.DAY_OF_MONTH));
	System.out.println("Día de la semana: " + (cal.get(Calendar.DAY_OF_WEEK)-1));
	
	}

}
