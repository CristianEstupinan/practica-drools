package Model;

public class InfoAbstractaCliente {

    public enum RangoEdad{
        Joven, Adulto, Mayor
    }

    public enum Riesgo{
        Bajo, Medio, Alto
    }

    public RangoEdad rangoEdad;
    public int nivelEducativo;
    public Riesgo riesgo;

    public InfoAbstractaCliente(RangoEdad rangoEdad, int nivelEducativo, Riesgo riesgo) {
        this.rangoEdad = rangoEdad;
        this.nivelEducativo = nivelEducativo;
        this.riesgo = riesgo;
    }
}