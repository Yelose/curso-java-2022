package ej7;

public class SortNumbersArray2Loops {

	public static void main(String[] args) {
		int[] numeros = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
	 		
		for (int i = 0; i < numeros.length; i++) {  
			for (int j = i + 1; j < numeros.length; j++){  
				int tmp = 0;  
				if (numeros[i] > numeros[j]){  
					tmp = numeros[i];  
					numeros[i] = numeros[j];  
					numeros[j] = tmp;  
				}  
			}  
		} 
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}	
	}
}
