package Model;

import static Model.Aficiones.Intereses;
import static Model.InfoAbstractaCliente.Riesgo;

public class Actividad {

    public String[] idioma;
    public Intereses[] tipo;
    public int costeMax;
    public boolean necesidadDeportiva;
    public Riesgo riesgo;

    public Actividad(String[] idioma, Intereses[] tipo, int costeMax, boolean necesidadDeportiva, Riesgo riesgo) {
        this.idioma = idioma;
        this.tipo = tipo;
        this.costeMax = costeMax;
        this.necesidadDeportiva = necesidadDeportiva;
        this.riesgo = riesgo;
    }


}
