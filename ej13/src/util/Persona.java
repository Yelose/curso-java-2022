package util;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
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
	
	@Override
	public int hashCode() {
		return Objects.hash(age, exp, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return age == other.age && exp == other.exp && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Persona [exp=" + exp + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return ((Integer)age).compareTo(o.getAge());
	}
}
