// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package gestioncitas;

import java.util.Date;

public class citamedica extends cita {
    private String motivo;

    public citamedica(int nrodetel, int dni, Date fecha, Date hora, String lugar, String motivo) {
        super(nrodetel, dni, fecha, hora, lugar);
        this.motivo = motivo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cita Médica:");
        System.out.println("Número de Teléfono: " + getNrodetel());
        System.out.println("DNI: " + getDni());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Hora: " + getHora());
        System.out.println("Lugar: " + getLugar());
        System.out.println("Motivo: " + motivo);
    }
}
