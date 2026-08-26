// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package gestioncitas;
    import java.util.ArrayList;
    import java.util.List;

public class registroCitas {

    static boolean mostrarCitas;
     private final List<cita>citas;
    
    public registroCitas(){
        citas = new ArrayList<>();
    }
    
    public void AgregarCitas(cita Cita) {
        citas.add(Cita);
    }
    
    public void mostrarCitas() {
    if (citas.isEmpty()) {
         System.out.println("No se encuentran usuarios");
    } else {
            for (cita Cita : citas) {
                System.out.println(Cita);
            }
    }
    }
}
