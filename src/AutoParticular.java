public class AutoParticular extends Vehiculo {

    private int cantidadPuertas;

    public AutoParticular(String patente, String marca, int anioFabricacion,
                          int cantidadPuertas) {

        super(patente, marca, anioFabricacion);

        this.cantidadPuertas = cantidadPuertas;
    }

    public void mostrarPuertas() {
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}
