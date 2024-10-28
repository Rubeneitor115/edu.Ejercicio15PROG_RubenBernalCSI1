/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 281024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 281024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		//Solicito al usuario el número
		System.out.println("Introduzca un número entero: ");
		numero = sc.nextInt();
		
		//Muestro todos los números que hay del 1 al número introducido por el usuario
		System.out.println("Los números que hay hasta " + numero + " son: ");
		for(int i = 1; i < numero; i++){
			System.out.println(i);
		}
		
		sc.close();

	}

}
