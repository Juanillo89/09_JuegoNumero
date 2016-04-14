package juegoNumero;

import java.util.Scanner;

public class JuegoNumero
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Turno del Jugador1. Introduce número(1-100) a adivinar: ");
		int numeroFin = sc.nextInt();
		int contador = 0;
		while(numeroFin < 1 || numeroFin > 100)
		{
			System.out.print("Número fuera de rango. Introduce número(1-100): ");
			numeroFin = sc.nextInt();
		}
		System.out.print("Turno del Jugador2. Intenta descubrir el número(1-100), tienes 10 intentos: ");
		int numero = sc.nextInt();
		contador++;
		while(numero != numeroFin && contador != 10)
		{
			if(numero < 1 || numero > 100)
			{
				System.out.print("Número fuera de rango. Intenta descubrir el número(1-100): ");
			}
			else if(numero > numeroFin)
			{
				System.out.print("Te pasaste. Intenta descubrir el número(1-100): ");
				contador++;
			}
			else
			{
				System.out.print("No llegaste. Intenta descubrir el número(1-100): ");
				contador++;
			}
			numero = sc.nextInt();
		}
		sc.close();
		if(numero != numeroFin)
		{
			System.out.println("Se te han agotado los intentos, gana el Jugador1. Fin de la partida.");
		}
		else
		{
			System.out.println("Acertaste!, gana el Jugador2. Fin de la partida.");
		}
	}
}
