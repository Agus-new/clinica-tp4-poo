// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package citamedica;

import usuarios.usuario; 
import gestioncitas.cita;
import java.util.Scanner;
import usuarios.RegistroUsuarios;
import java.io.*;
import java.util.InputMismatchException;

interface Usuario {
    void mostrarInfo();
}

interface Cita {
    void mostrarDetalles();
}

public class Opciones {

    private static Object registroCitas;

    public static void main(String[] args) {
        RegistroUsuarios Usuarios = new RegistroUsuarios();
        Scanner scanner = new Scanner(System.in); 
        boolean continuar = true;

        
        while (continuar) {
            try {
                System.out.println("Menu");
                System.out.println("1. Inicio de sesion");
                System.out.println("2. Registrarse");
                System.out.println("3. Dias disponibles");
                System.out.println("4. Crear cita");
                System.out.println("5. Confirmar cita");
                System.out.println("6. Salir");
                System.out.print("Ingrese opcion: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingrese su DNI: ");
                        String DNI = scanner.nextLine();
                        
                    }
                    case 2 -> {
                        System.out.println("Ingrese su nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese su DNI: ");
                        String dni = scanner.nextLine();
                        System.out.println("Ingrese su apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.println("Ingrese su número de teléfono: ");
                        String nrodetel = scanner.nextLine();

                        usuario usuario = new usuario(nombre, apellido, nrodetel, dni) {
                            @Override
                            public void mostrarInfo() {
                                System.out.println("Usuario creado: " + nombre + " " + apellido);
                            }
                        };
                        usuario.mostrarInfo(); 
                    }
                    case 3 -> {
                        System.out.println("Los días disponibles son: ");
                        

                        String hora = scanner.nextLine();
                        String nrodetel = scanner.nextLine();
                        String dni = scanner.nextLine();
                        String fecha = scanner.nextLine();
                        String lugar = scanner.nextLine();

                        cita cita = new cita(nrodetel, dni, fecha, hora, lugar) {
                            @Override
                            public void mostrarDetalles() {
                                System.out.println("Cita creada para el " + fecha + " a las " + hora);
                            }
                        };
                        cita.mostrarDetalles();  
                    }
                    case 4 -> {
                        System.out.println("Ingrese el Día: ");
                        String dia = scanner.nextLine();
                        System.out.println("Ingrese horario: ");
                        String horario = scanner.nextLine();
                        
                    }
                    case 5 -> {
                        System.out.println("Ingrese fecha y hora confirmada: ");
                        String citaConfirmada = scanner.nextLine();
                        
                    }
                    case 6 -> {
                        continuar = false;
                        System.out.println("Saliendo...");
                    }
                    default -> System.out.println("Esa no es una opción, inténtelo nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido para la opcion.");
                scanner.nextLine(); 
            } 
        }
            scanner.close();
        
    }
}
