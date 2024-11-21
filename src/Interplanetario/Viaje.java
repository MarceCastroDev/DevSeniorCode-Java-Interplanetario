package Interplanetario;

import java.util.Random;

public class Viaje {
    private Planeta destino;
    private Nave nave;
    private int pasajeros;
    private double distanciaRecorrida;
    private double tiempoTranscurrido;

    // Constructor
    public Viaje(Planeta destino, Nave nave, int pasajeros) {
        this.destino = destino;
        this.nave = nave;
        this.pasajeros = pasajeros;
        this.distanciaRecorrida = 0;
        this.tiempoTranscurrido = 0;
    }

    // Método para calcular el tiempo total del viaje
    public double calcularTiempoTotal() {
        return destino.getDistancia() / nave.getVelocidad();
    }

    // Método para simular un paso del viaje
    public void simularPaso() {
        // Calcular la distancia recorrida en este paso (por ejemplo, 1% del total)
        double distanciaPorPaso = destino.getDistancia() * 0.01;
        distanciaRecorrida += distanciaPorPaso;
        tiempoTranscurrido += (distanciaPorPaso / nave.getVelocidad());

        // Simular eventos aleatorios
        Random random = new Random();
        int evento = random.nextInt(3);
        switch (evento) {
            case 0:
                System.out.println("¡Todo marcha bien! Continuamos el viaje.");
                break;
            case 1:
                System.out.println("¡Alerta! Se ha detectado un meteorito. Se requiere una maniobra evasiva.");
                // Simular la maniobra (por ejemplo, consumir combustible extra)
                break;
            case 2:
                System.out.println("¡Falla en los sistemas! Se requiere una reparación urgente.");
                // Simular la reparación (por ejemplo, aumentar el tiempo de viaje)
                break;
        }

        // Mostrar el progreso del viaje
        System.out.println("Distancia recorrida: " + distanciaRecorrida + " km");
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " horas");
        System.out.println("Combustible restante: ..."); // Implementar la gestión de combustible
        System.out.println("Oxígeno restante: ..."); // Implementar la gestión de oxígeno
    }

    // Método para iniciar el viaje
    public void iniciarViaje() {
        // Calcular el tiempo total del viaje
        double tiempoTotal = calcularTiempoTotal();

        // Simular el viaje paso a paso
        while (distanciaRecorrida < destino.getDistancia()) {
            simularPaso();
            // Puedes agregar un delay aquí para simular el paso del tiempo
        }

        System.out.println("¡Hemos llegado a " + destino.getNombre() + "!");
    }
}