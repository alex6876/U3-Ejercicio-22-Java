public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String patente, String marca, int anioFabricacion,
                       int cilindrada) {

        super(patente, marca, anioFabricacion);

        this.cilindrada = cilindrada;
    }

    public void mostrarCilindrada() {
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
