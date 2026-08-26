// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package main;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


interface MostrarUsuario {
    void mostrarInfo();
}

interface MostrarCitas {
    void mostrarInfo();
}

interface MostrarClinica {
    void mostrarInfo();
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        RegistroCitas registroCitas = new RegistroCitas();
        RegistroUsuarios registroUsuarios = new RegistroUsuarios();
        HistoriaClinica historiaClinica = new HistoriaClinica();
        boolean continuar = true;


        while(continuar){
            try {
                System.out.println("Menu");
                System.out.println("1. Mantener registro");
                System.out.println("2. Ver historial clínico");
                System.out.println("3. Crear historial clínico");
                System.out.println("4. Salir");
                System.out.print("Ingrese opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1 -> {
                        
                        registroUsuarios.mostrarInfo();
                        registroCitas.mostrarInfo();
                        historiaClinica.mostrarInfo();
                    }
                    case 2 -> {
                        System.out.println("El historial clínico es el siguiente: ");
                        historiaClinica.mostrarInfo();
                    }
                    case 3 -> {
                        System.out.println("Ingrese el historial del paciente: ");
                        String historial = scanner.nextLine();
                       
                    }
                    case 4 -> {
                        continuar = false;
                        System.out.println("Saliendo...");
                    }
                    default -> System.out.println("Esa no es una opción, inténtelo nuevamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingrese una opción válida.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Se ha producido un error inesperado: " + e.getMessage());
            }
        }

        
        scanner.close();
    }

  
    private static class HistoriaClinica implements MostrarClinica {

        private String historialClinico;

        public HistoriaClinica() {
            this.historialClinico = "Historial de ejemplo: Sin registros";
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Historial Clínico: " + historialClinico);
        }
    }

    private static class RegistroCitas implements MostrarCitas {

        private String citas;

        public RegistroCitas() {
            this.citas = "No hay citas registradas";
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Citas registradas: " + citas);
        }
    }

    private static class RegistroUsuarios implements MostrarUsuario {

        private String usuarioInfo;

        public RegistroUsuarios() {
            this.usuarioInfo = "Usuario: Sin registros";
        }

        @Override
        public void mostrarInfo() {
            System.out.println("Información de usuario: " + usuarioInfo);
        }
    }
}
