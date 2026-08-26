// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package usuarios;
    import java.util.ArrayList;
    import java.util.List;  

public class RegistroUsuarios {

    private final List<usuario>usuarios;
    
    public RegistroUsuarios(){
        usuarios = new ArrayList<>();
    }
    
    public void AgregarUsuario(usuario Usuario) {
        usuarios.add(Usuario);
    }
    
    public void mostrarUsuario() {
    if (usuarios.isEmpty()) {
         System.out.println("No se encuentran usuarios");
    } else {
            for (usuario Usuario : usuarios) {
                System.out.println(Usuario);
            }
    }
    }
}
