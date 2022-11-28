package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class SetOperations {
	private static Object items;
	public static <T> Set<T> convertToSet(T[] arr){
        Set<T> items = new HashSet<>();
         for (T i: arr) {
            items.add(i);
        }
        return items;
	}
	        
	public static <T> List<T>union(List<T> a, List<T> b){
		List<T> result = new ArrayList<>();
		result.addAll(a);
		result.addAll(b);
		return result;
	}

	public static Object getItems() {
		return items;
	}

	public static void setItems(Object items) {
		SetOperations.items = items;
	}
}
