package modules;

import java.util.ArrayList;
import java.util.List;

public class MiPila {

	private List<String> list=new ArrayList<String>();
	
	public List<String> getList() {
		return list;
	}

	public String pop() {		
		String ultimo = list.remove(list.size() - 1);
		return ultimo;
	}
		
	public void push(String e){
		list.add(e);
	}
	
	public String peek() {
		String mostrarUltimo = list.get(list.size()-1);
		return mostrarUltimo;
	}
	
	public void reverse() {
		ArrayList<String> list2 = new ArrayList<String>();
		int index = list.size();
		for (int i = 0; i < index; i++) {
			list2.add(list.remove(list.size() - 1));
		}
		list = list2;
	}
}
