import java.util.Scanner;

public class EjercicioNotasAlumnosConArrays {

	public static void main(String[] args) {
		// Variables
		int opcion;
		String dni;
		boolean encontrado=false;
		final int FILAS=100;
		final int COLUMNAS=10;
		String alumnos [][] = new String[FILAS][COLUMNAS];
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" === MENÚ DE OPCIONES ===");
			System.out.println("1.- Dar de alta alumnos");
			System.out.println("2.- Dar de baja alumnos");
			System.out.println("3.- Modificar datos alumnos");
			System.out.println("4.- Notas de un alumno");
			System.out.println("5.- Notas de todos los alumnos");
			System.out.println("6.- Media de un módulo");
			System.out.println("7.- Media del alumno para todos los módulos");
			System.out.println("8.- Media de la clase para todos los módulos");
			System.out.println("9.- Salir");
			opcion=sc.nextInt();
			switch(opcion) {
				case 1: System.out.print("Dime tu dni: ");
						dni=sc.nextLine();
						for(int i=0;i<FILAS;i++) {
							if(alumnos[i][0]!=null && alumnos[i][0].equals(dni)) {
								System.out.println("Este alumn@ está insertado");
								encontrado=true;
								break;
							}
						}
						if(!encontrado) {
							for(int i=0;i<FILAS;i++) {
								if(alumnos[i][0]==null) {
									alumnos[i][0]=dni;
									System.out.print("Dime tu nombre: ");
									alumnos[i][1]=sc.nextLine();
									System.out.print("Dime tus apellidos : ");
									alumnos[i][2]=sc.nextLine();
								}
							}
						}	
					break;
				case 2: System.out.print("Dime tu dni: ");
						dni=sc.nextLine();
						for(int i=0;i<FILAS;i++) {
							if(alumnos[i][0].equals(dni)) {
								alumnos[i][0]=null;
								System.out.println("Alumno borrado");
								break;
							}
						}
					break;
				case 3:
					break;
				case 4: encontrado=false;
						System.out.print("Dime tu dni: ");
						dni=sc.nextLine();
						for(int i=0;i<FILAS;i++) {
							if(alumnos[i][0]!=null && alumnos[i][0].equals(dni)) {
								System.out.print("Dime la nota de programación");
								alumnos[i][3]=sc.nextLine();
								System.out.print("Dime la nota de sistemas");
								alumnos[i][4]=sc.nextLine();
								System.out.print("Dime la nota de base de datos");
								alumnos[i][5]=sc.nextLine();
								System.out.println("Alumn@ insertado correctamente");
								encontrado=true;
								break;
							}
						}
						if(!encontrado)System.out.println("El alumn@ no econtrad@");
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9: System.out.println("Hasta pronto");
					break;
				default: System.out.println("Opción incorrecta");
			}
		} while(opcion!=9);

	}

}
