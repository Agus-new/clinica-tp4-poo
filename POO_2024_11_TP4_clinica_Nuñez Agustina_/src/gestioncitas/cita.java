// Nuñez Agustina Cecilia Itati
//46.978.693
//INF382-10160
package gestioncitas;

import java.util.Date;

public abstract class cita {
    private int nrodetel;
    private int dni;
    private Date fecha;
    private Date hora;
    private String lugar;

    
    public cita(int nrodetel, int dni, Date fecha, Date hora, String lugar) {
        this.nrodetel = nrodetel;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }
    public abstract void mostrarDetalles();
    public cita(String nrodetel, String dni, String fecha, String hora, String lugar) {
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

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
