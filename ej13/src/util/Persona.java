package util;

public class Persona {
	private int exp;
	private String name;
	private int age;
	
	public Persona() {}
	
	public Persona(int exp, String name, int age) {
		this.setExp(exp);
		this.setName(name);
		this.setAge(age);
	}
	
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
