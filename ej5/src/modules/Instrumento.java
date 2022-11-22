package modules;

public class Instrumento extends Orquesta {
	String name = "";
	public void Sonar() {
		System.out.println("El " + this.name +  " suena");
	}

}
