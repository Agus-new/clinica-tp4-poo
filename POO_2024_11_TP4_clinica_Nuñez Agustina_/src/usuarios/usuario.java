// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package usuarios;
public abstract class usuario {
     private String nombre;
     private String apellido;
     private int nrodetel;
     private int dni;
     
     public usuario (String nombre, String apellido, int nrodetel, int dni){
         this.nombre = nombre;
         this.apellido = apellido;
         this.dni = dni;
         this.nrodetel = nrodetel;
     }
    public abstract void mostrarInfo();
    public usuario(String nombre, String apellido, String nrodetel, String dni) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNrodetel() {
        return nrodetel;
    }

    public void setNrodetel(int nrodetel) {
        this.nrodetel = nrodetel;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
