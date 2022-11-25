package modules;

import java.util.ArrayList;
import java.util.List;

public class MiPila {

	public static void main(String[] args) {
		iniciarLista();
		pop();
		push("manzana");
		peek();
		System.out.println(list);
		reverse();
	}
	
	static List<String> list=new ArrayList<String>();
	
	static void iniciarLista() {
		list.add("pera");
		list.add("patata");
		list.add("plato");
		list.add("tenedor");
		
		System.out.println("lista inicial = " + list);
	}
	
	static void pop() {		
		String ultimo = list.remove(list.size() - 1);
		System.out.println("borrado " + ultimo + ". Lista= " + list);
	}
	
	
	static void push(String e){
		list.add(e);
		System.out.println("push " + e + " = " + list);
	}
	
	static void peek() {
		String mostrarUltimo = list.get(list.size()-1);
		System.out.println(mostrarUltimo);
	}
	
	static void reverse() {
		ArrayList<String> list2 = new ArrayList<String>();
		int index = list.size();
		for (int i = 0; i < index; i++) {
			list2.add(list.remove(list.size() - 1));
		}
		list = list2;
		System.out.println(list);
	}
}
