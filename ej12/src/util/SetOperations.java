package util;
import java.util.HashSet;
import java.util.Set;

public abstract class SetOperations {
        
	public static <T> Set<T>union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<>();
		result.addAll(a);
		result.addAll(b);
		return result;
	}
}
