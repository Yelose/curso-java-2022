package es.edu.capgemini.piedrapapeltijera.modelo;

import java.util.Scanner;

public class Jugar {

	public static void main(String[] args) {
		System.out.println("Vamos a jugar a piedra-papel-tijera");
		
		System.out.println("Elige piedra 1, papel 2 o tijera 3, y marca el número correspondiente");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		int numeroMaquina = (int)(Math.random()*3) +1;
		
		PiedraPapelTijeraFactory tiradaUsuario = PiedraPapelTijeraFactory.getInstance(numero);
		PiedraPapelTijeraFactory tiradaMaquina = PiedraPapelTijeraFactory.getInstance(numeroMaquina);
		
		sc.close();
		tiradaUsuario.comparar(tiradaMaquina);
		
		System.out.println("\n\nEl resultado del juego es ...");
		System.out.println("el usuario eligió: " + tiradaUsuario.getNombre());
		System.out.println("el ordenador eligió: " + tiradaMaquina.getNombre());
		System.out.println("Resultado: " + tiradaUsuario.getDescripcionResultado());
	}

}
