import java.util.Scanner;
/*
 * Programa Java para leer la altura de N personas y calcular la altura 
 * media. Calcular cuántas personas tienen una altura superior a la media y
 * cuántas tienen una altura inferior a la media. El valor de N se pide por 
 * teclado y debe ser entero positivo.
 * */
public class arraysAlturasMedia {

	public static void main(String[] args) {
		//Declaración de variables
		int arrayAlturas [], media=0, superior=0, inferior=0, igual=0;
		
		Scanner sc = new Scanner(System.in);
		
		//Petición de datos
		System.out.print("¿Cuántos alumn@s quieres calcular la altura: ");
		arrayAlturas = new int [sc.nextInt()];
		
		//Petición de alturas
		for(int i=0;i<arrayAlturas.length;i++) {
			System.out.print("Dime la altura en cm:  ");
			arrayAlturas[i]=sc.nextInt();
		}
		
		//Calcular la media
		for(int i=0;i<arrayAlturas.length;i++) {
			media+=arrayAlturas[i];
		}
		media/=arrayAlturas.length;
		
		//Comprobar las alturas con la media
		for(int i=0;i<arrayAlturas.length;i++) {
			if(arrayAlturas[i]<media) inferior++;
			else if (arrayAlturas[i]==0) igual++;
			else superior++;
			
		}

		System.out.println("Cantidad de personas por debajo de la media "+inferior);
		System.out.println("Cantidad de personas igual que la media "+igual);
		System.out.println("Cantidad de personas por encima de la media "+superior);
	}

}
