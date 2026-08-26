// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package usuarios;

public class personalmedico extends usuario {
    private final String especialidad;

    public personalmedico(String nombre, String apellido, int nrodetel, int dni, String especialidad) {
        super(nombre, apellido, nrodetel, dni);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Personal Médico: " + getNombre() + " " + getApellido() + ", DNI: " + getDni() + ", Teléfono: " + getNrodetel());
        System.out.println("Especialidad: " + especialidad);
    }
}
