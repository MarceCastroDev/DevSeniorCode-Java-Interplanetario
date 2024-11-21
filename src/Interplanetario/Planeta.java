package Interplanetario;

public class Planeta {
    private String nombre;
    private double distancia;

    public Planeta(String nombre, double distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;

    }

    public double getDistancia() {
        return distancia;
    }

    @Override
    public
String toString() {
    return "Planeta: " + nombre + ", Distancia: " + distancia + "km";
}
}