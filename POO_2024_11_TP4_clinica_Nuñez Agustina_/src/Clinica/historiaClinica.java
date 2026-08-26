// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package Clinica;
    import java.util.ArrayList;
    import java.util.List; 
    import Clinica.clinica;

public class historiaClinica {

    public static boolean mostrarClinica;
    
    private List<clinica>clinicas;
    
    public historiaClinica(){
        clinicas = new ArrayList<>();
    }
    
    public void AgregarHistorial(clinica historial) {
        clinicas.add(historial);
    }
    
    public void mostrarClinica() {
    if (clinicas.isEmpty()) {
         System.out.println("No se encuentran usuarios");
    } else {
            for (clinica historial : clinicas) {
                System.out.println(historial);
            }
    }
    }
}
