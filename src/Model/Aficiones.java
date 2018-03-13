package Model;

import java.util.ArrayList;

public class Aficiones {

    public enum Intereses{
        Cultural, Paisajistico, Deportivo, Comercial, Social, Formacion
    }

    public ArrayList<Intereses> intereses = new ArrayList<>();

    public boolean add(Intereses intereses) {
        return this.intereses.add(intereses);
    }
}
