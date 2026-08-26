// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package Clinica;

import java.util.Date;

public class clinica {
    private String usuario;
    private Date cita;
    private String historial;
    
    public clinica (String usuario, Date cita, String historial){
         this.usuario = usuario;
         this.cita = cita;
         this.historial = historial;
     }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getCita() {
        return cita;
    }

    public void setCita(Date cita) {
        this.cita = cita;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
}

