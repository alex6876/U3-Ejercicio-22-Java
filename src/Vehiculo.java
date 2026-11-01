public class Vehiculo {

    protected String patente;
    protected String marca;
    protected int anioFabricacion;
    protected boolean encendido;

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println("El vehículo está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El vehículo está apagado.");
    }

    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anioFabricacion);
        System.out.println("Encendido: " + encendido);
    }
}
