public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String patente, String marca, int anioFabricacion,
                  double capacidadCarga) {

        super(patente, marca, anioFabricacion);

        this.capacidadCarga = capacidadCarga;
    }

    public void mostrarCapacidad() {
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}
