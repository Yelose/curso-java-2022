package modules;

import java.util.ArrayList;
import java.util.List;

public class MiPila<T> {

	private List<T> list=new ArrayList<T>();
	

	public T pop() {		
		T ultimo = list.remove(list.size() - 1);
		return ultimo;
	}
		
	public void push(T e){
		list.add(e);
	}
	
	public T peek() {
		T mostrarUltimo = list.get(list.size()-1);
		return mostrarUltimo;
	}
	
	public void reverse() {
		ArrayList<T> list2 = new ArrayList<T>();
		int index = list.size();
		for (int i = 0; i < index; i++) {
			list2.add(list.remove(list.size() - 1));
		}
		list = list2;
	}
	public List<T> getList() {
		return list;
	}
}
