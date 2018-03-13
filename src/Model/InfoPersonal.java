package Model;

public class InfoPersonal {

    public enum EstadoCivil{
        Soltero, Casado, Divorciado
    }

    public enum Estudios{
        Ninguno, Basico, GradoMedio, GradoSuperior, Universitario
    }

    public int edad;
    public String[] idiomas;
    public EstadoCivil estadoCivil;
    public Estudios estudios;
    public boolean discapacidad;
    public int costeMax;
    public boolean capacidadDeportiva;

    public InfoPersonal(int edad, String[] idiomas, EstadoCivil estadoCivil, Estudios estudios, boolean discapacidad, int costeMax, boolean capacidadDeportiva) {
        this.edad = edad;
        this.idiomas = idiomas;
        this.estadoCivil = estadoCivil;
        this.estudios = estudios;
        this.discapacidad = discapacidad;
        this.costeMax = costeMax;
        this.capacidadDeportiva = capacidadDeportiva;
    }
}
