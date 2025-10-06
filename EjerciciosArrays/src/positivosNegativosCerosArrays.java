import java.util.Scanner;
/*
 * Programa Java que guarda en un array 10 números enteros que se leen por 
 * teclado. A continuación se recorre el array y calcula cuántos números 
 * son positivos, cuántos negativos y cuántos ceros.
 * */

public class positivosNegativosCerosArrays {

	public static void main(String[] args) {
		final int NOTAS = 10;
		int arrayNotas [] = new int [NOTAS];
		int positivos=0, negativos=0, ceros=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arrayNotas.length;i++) {
			System.out.print("Dime la nota para la posición "+i+" ");
			arrayNotas[i]=sc.nextInt();
		}
		
		for(int i=0;i<arrayNotas.length;i++) {
			if(arrayNotas[i]<0) negativos++;
			else if (arrayNotas[i]==0) ceros++;
			else positivos++;
			
		}
		System.out.println("Cantidad de números negativos "+negativos);
		System.out.println("Cantidad de números cero "+ceros);
		System.out.println("Cantidad de números positivos "+positivos);

	}

}
