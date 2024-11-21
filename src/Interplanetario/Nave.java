package Interplanetario;

public class Nave {
    private String nombre;
    private double velocidad;
    private int capacidad;

    public Nave(String nombre, double velocidad, int capacidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Nave: " + nombre + ", Velocidad: " + velocidad + " km/h, Capacidad: " + capacidad + " pasajeros";
    }
}