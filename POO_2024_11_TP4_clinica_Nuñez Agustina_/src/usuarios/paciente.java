// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package usuarios;

public class paciente extends usuario {
    private final String historialClinico;

    public paciente(String nombre, String apellido, int nrodetel, int dni, String historialClinico) {
        super(nombre, apellido, nrodetel, dni);
        this.historialClinico = historialClinico;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Paciente: " + getNombre() + " " + getApellido() + ", DNI: " + getDni() + ", Teléfono: " + getNrodetel());
        System.out.println("Historial Clínico: " + historialClinico);
    }
}
