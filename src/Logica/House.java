package Logica;

import java.util.Comparator;

public class House {
    private String direccion;
    private String color;
    private int numeroDePisos;
    private int area;
    private float size;

    public static Comparator<House> compaColor=new Comparator<House>() {
        @Override
        public int compare(House o1, House o2) {
            return o1.getColor().compareTo(o2.getColor());
        }
    };
public static final Comparator<House> compPisos=((o1,o2)->{//el primer parentesis el del new y los objetos me hacen lo del metodo compare
    return Double.compare(o1.getNumeroDePisos(),o2.getNumeroDePisos());
    });

public static Comparator<House> comDireccion=(((o1, o2) ->Integer.compare(o1.getDireccion().length(),o2.getDireccion().length())) );

    public House(String direccion, String color, int numeroDePisos, int area) {
        this.direccion = direccion;
        this.color = color;
        this.numeroDePisos = numeroDePisos;
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "direccion='" + direccion + '\'' +
                ", color='" + color + '\'' +
                ", numeroDePisos=" + numeroDePisos +
                ", area=" + area +
                '}';
    }


}
