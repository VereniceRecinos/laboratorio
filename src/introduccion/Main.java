package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        while (true) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Mostrar estudiante con la calificación más alta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion;
            try {
            	opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            	System.out.println("Debe ingresar un número válido.");
            	continue;
            }
            
            if (opcion == 1) {
            	agregarEstudiante();
            }
            else if (opcion == 2) {
            	mostrarEstudiantes();
            }
            else if (opcion == 3) {
            	calcularPromedio();
            }
            else if (opcion == 4) {
            	mostrarMayor();
            }
            else if (opcion == 5) {
            	System.out.println("Saliendo del programa...");
            	break;
            }
            else {
            	System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }



			//Agregar estudiante
    public static void agregarEstudiante() {


                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificación del estudiante: ");
                double calificacion;
                
                try { 
                	calificacion = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                	System.out.println("Debe ingresar un número válido para la calificación.");
                	return;
                }

                estudiantes.add(nombre);
                calificaciones.add(calificacion);

                System.out.println("Estudiante agregado correctamente.");

            } 
            
            //Mostrar lista de estudiantes
            
    public static void mostrarEstudiantes() {

            if (estudiantes.isEmpty()) {
                System.out.println("No hay estudiantes registrados.");
            } else {
                System.out.println("\nLista de estudiantes:");
                for (int i = 0; i < estudiantes.size(); i++) {
                    System.out.println(estudiantes.get(i) +
                            " - Calificación: " + calificaciones.get(i));
                }
            }   
    }
            
    		//Calcular promedio de calificaciones
            
        	public static void calcularPromedio() {
        	
        		if (calificaciones.isEmpty()) {
                    System.out.println("No hay calificaciones registradas.");
                } else {
                    double suma = 0;

                    for (double calificacion : calificaciones) {
                        suma += calificacion;
                    }

                    double promedio = suma / calificaciones.size();
                    System.out.println("El promedio de calificaciones es: " + promedio);
                }
                
                

				} 
        	
        	//Mostrar estudiante con la calificación más alta
        	
        	public static void mostrarMayor() {
        		

                    if (calificaciones.isEmpty()) {
                        System.out.println("No hay calificaciones registradas.");
                    } else {

                        double maxCalificacion = calificaciones.get(0);
                        String estudianteMax = estudiantes.get(0);

                        for (int i = 1; i < calificaciones.size(); i++) {
                            if (calificaciones.get(i) > maxCalificacion) {
                                maxCalificacion = calificaciones.get(i);
                                estudianteMax = estudiantes.get(i);
                            }
                        }

                        System.out.println("El estudiante con la calificación más alta es: "
                                + estudianteMax + " con " + maxCalificacion);
                    }
        	}
        }