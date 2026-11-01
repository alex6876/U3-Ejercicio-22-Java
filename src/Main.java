public class Main {

    public static void main(String[] args) {

        AutoParticular auto = new AutoParticular(
                "AB123CD", "Toyota", 2022, 4
        );

        Camion camion = new Camion(
                "AC456EF", "Mercedes-Benz", 2020, 15.5
        );

        Motocicleta moto = new Motocicleta(
                "A123BCD", "Honda", 2023, 150
        );

        System.out.println("=== AUTOMÓVIL ===");
        auto.mostrarInformacion();
        auto.mostrarPuertas();
        auto.encender();

        System.out.println("\n=== CAMIÓN ===");
        camion.mostrarInformacion();
        camion.mostrarCapacidad();
        camion.encender();

        System.out.println("\n=== MOTOCICLETA ===");
        moto.mostrarInformacion();
        moto.mostrarCilindrada();
        moto.encender();
    }
}
