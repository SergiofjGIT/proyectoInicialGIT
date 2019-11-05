/*
* @author Sergio Fernández Jiménez
*/
import java.util.Scanner;
public class U2Practica6{


	public static void main(String [] args){

		int  numeroDelUsuario1, numeroDelUsuario2, operacion;
		Scanner teclado = new Scanner(System.in);


		numeroDelUsuario1 = teclado.nextInt();
		numeroDelUsuario2 = teclado.nextInt();

		System.out.println("1:Sumar, 2:Restar, 3:Multiplicar, 4:Dividir");

		operacion = teclado.nextInt();

		switch (operacion) {

			case 1:

				System.out.println(numeroDelUsuario1 + numeroDelUsuario2);

				break;

			case 2:

				System.out.println(numeroDelUsuario1 - numeroDelUsuario2);

				break;

			case 3:

				System.out.println(numeroDelUsuario1 * numeroDelUsuario2);

				break;

			case 4:

				System.out.println(numeroDelUsuario1 / numeroDelUsuario2);

				break;

			default:

				System.out.println("Incorrecto");

		}


	}
}