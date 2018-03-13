package Model;

import java.util.Date;

public class PropuestaActividad {

    public Actividad actividad;
    public Cliente cliente;
    public Date date;

    public PropuestaActividad(Actividad actividad, Cliente cliente, Date date) {
        this.actividad = actividad;
        this.cliente = cliente;
        this.date = date;
    }
}
