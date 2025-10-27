package Tablets;

import java.util.Scanner;

public class EjercicioTablets {

	public static void main(String[] args) {
		// Variable
		int opcion;
		final int FILAS=10;
		final int COLUMNAS=6;
		String lista [][] = new String [FILAS][COLUMNAS];
		Scanner sc = new Scanner(System.in);
		do {
			opcion = recogerOpcionMenu(sc);
			menuOpciones(opcion, sc, lista);
		}while(opcion!=5);	
	}
	
	public static void menuOpciones(int opcion, Scanner sc, String lista [][]) {
		switch(opcion) {
			case 1: insertarTablet(sc, lista);
				break;
			case 2: mostrarTabletsDisponibles(lista);
				break;
			case 3: venderTablet(lista, sc);
				break;
			case 4: mostrarTabletsVendidas(lista);
				break;
			case 5: System.out.println("Hasta pronto");
				break;
			default: System.out.println("Opcion incorrecta");
		}
	}
	
	public static void venderTablet(String lista [][], Scanner sc) {
		mostrarTabletsDisponibles(lista);
		System.out.print("Dime el numero de serie de la quieres comprar: ");
		String numSerie=sc.nextLine();
		for(int i=0;i<lista.length;i++) {
			if(lista[i][0]!=null && lista[i][0].equalsIgnoreCase(numSerie) && lista[i][5]==null) {
				System.out.print("Dime el dni: ");
				lista[i][5]=sc.nextLine();
				break;
			}
		}
	}
	
	public static void mostrarTabletsDisponibles(String lista [][]) {
		for (int i=0;i<lista.length;i++) {
			if(lista[i][5]==null) {
				System.out.println("-------");
				System.out.println("Numero de serie: "+lista[i][0]);
				System.out.println("Marca: "+lista[i][1]);
				System.out.println("Modelo: "+lista[i][2]);
				System.out.println("Color: "+lista[i][3]);
				System.out.println("Precio: "+lista[i][4]);
				System.out.println("-------");
			}
		}
	}
	public static void mostrarTabletsVendidas(String lista [][]) {
		for (int i=0;i<lista.length;i++) {
			if(lista[i][5]!=null) {
				System.out.println("-------");
				System.out.println("Numero de serie: "+lista[i][0]);
				System.out.println("Marca: "+lista[i][1]);
				System.out.println("Modelo: "+lista[i][2]);
				System.out.println("Color: "+lista[i][3]);
				System.out.println("Precio: "+lista[i][4]);
				System.out.println("Dni del cliente: "+lista[i][5]);
				System.out.println("-------");
			}
		}
	}
	public static void insertarTablet(Scanner sc, String lista [][]) {
		System.out.print("Dime el número de serie: ");
		String numSerie=sc.nextLine();
		if(existeTablet(numSerie, lista)) {
			System.out.println("No se puede insertar");
		}
		else {
			for (int i=0;i<lista.length;i++) {
				if(lista[i][0]!=null) {
					lista[i][0]=numSerie;
					System.out.print("Dime la marca: ");
					lista[i][1]=sc.nextLine();
					System.out.print("Dime el modelo: ");
					lista[i][2]=sc.nextLine();
					System.out.print("Dime el color: ");
					lista[i][3]=sc.nextLine();
					System.out.print("Dime el precio: ");
					lista[i][4]=sc.nextLine();
					System.out.println("Tablet insertada correctamente");
					break;
				}
			}
		}
	}
	public static boolean existeTablet(String numSerie, String lista [][]) {
		boolean existe = false;
		for (int i=0;i<lista.length;i++) {
			if(lista[i][0]!=null && lista[i][0].trim().equalsIgnoreCase(numSerie)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	public static int recogerOpcionMenu(Scanner sc) {
		int opcion;
		System.out.println("== MENÚ DE OPCIONES ==");
		System.out.println("1.- INSERTAR TABLET ");
		System.out.println("2.- MOSTRAR TABLETS DISPONIBLES");
		System.out.println("3.- VENDER TABLET");
		System.out.println("4.- MOSTRAR VENDIDAS");
		System.out.println("5.- SALIR");
		opcion = sc.nextInt();
		return opcion;
	}
}
