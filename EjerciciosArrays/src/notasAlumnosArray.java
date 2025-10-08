import java.util.Scanner;

public class notasAlumnosArray {

	public static void main(String[] args) {
		// Variables
		int cantidadAlumnos, opcion;
		String arrayDni [], dni;
		double arrayNotas [], nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántos alumnos tienes: ");
		cantidadAlumnos=sc.nextInt();
		
		arrayDni = new String [cantidadAlumnos];
		arrayNotas = new double [cantidadAlumnos];
		
		do {
			System.out.println("MENÚ DE OPCIONES A ELEGIR");
			System.out.println("0.- Dar de alta alumno");
			System.out.println("1.- Insertar nota.");
			System.out.println("2.- Modificar nota.");
			System.out.println("3.- Quitar nota.");
			System.out.println("4.- Sacar la media de la clase");
			System.out.println("5.- Salir");
			System.out.println("Dime la opción a ejecutar");
			opcion=sc.nextInt();
			
			switch(opcion) {
				case 0: System.out.println("Dime el dni del alumn@");
						dni=sc.nextLine();
						for(int i=0;i<arrayDni.length;i++) {
							if(arrayDni[i]==null) {
								arrayDni[i]=dni;
								break;
								//i=arrayDni.length;
							}
						}
					break;
				case 1: System.out.println("Dime el dni del alumn@");
						dni=sc.nextLine();
						System.out.println("Dime la nota del alumn@");
						nota=sc.nextDouble();
						for(int i=0;i<arrayDni.length;i++) {
							if(arrayDni[i]!=null && arrayDni[i].equals(dni)) {
								arrayNotas[i]=nota;
								break;
							}
						}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5: System.out.println("Gracias por participar");
					break;
				default: System.out.println("Opción incorrecta");
			}
		}while(opcion!=5);
	}

}
