/*
* @author Sergio Fernández Jiménez
*/
import java.util.Scanner;
public class U2Actividad2SFJ{


private static final double FALTADEPESO = 18.5, NORMAL = 25.0, SOBREPESO = 30;
	public static void main(String [] args){

		double  peso, alturacm, pesoIMC, alturam, alturaElevada;
		Scanner teclado = new Scanner(System.in);


		System.out.print("Introduce tu peso (KG):");
			peso = teclado.nextDouble();

		System.out.print("Introduce tu altura (cm):");
			alturacm = teclado.nextDouble();

		alturam = alturacm / 100;
		alturaElevada = Math.pow(alturam, 2.5);

		pesoIMC = (1.3 * peso) / alturaElevada;
		

		if (pesoIMC < FALTADEPESO) {

		System.out.printf("Tu IMC(Oxford2003) es %.3f (Falta de peso descompensado)\n", pesoIMC);

		}	else if (pesoIMC > SOBREPESO) {

			System.out.printf("Tu IMC(Oxford2003) es %.3f (Obesidad)\n", pesoIMC);

		}	else if (pesoIMC < SOBREPESO && pesoIMC > NORMAL) {

			System.out.printf("Tu IMC(Oxford2003) es %.3f (Sobrepeso)\n", pesoIMC);

		
		}	else if (pesoIMC > FALTADEPESO && pesoIMC < NORMAL) {

			System.out.printf("Tu IMC(Oxford2003) es %.3f (Normal)\n", pesoIMC);

		}	

		

	}
}