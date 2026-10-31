Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Jerarquía de Vehículos y Transporte (Herencia y Extensibilidad en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🚗 Simulación de Jerarquía de Vehículos (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de gestión vehicular, implementando una jerarquía de clases mediante herencia para representar diferentes tipos de medios de transporte (automóviles particulares, camiones de carga y motocicletas). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos**, la reutilización de constructores mediante `super`, la gestión de estados operativos y la especialización de comportamientos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general y sus respectivas subclases especializadas, acompañadas por un punto de ejecución:

* **`Vehiculo`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier vehículo de la flota.
* **Atributos protegidos (`protected`)**: `patente`, `marca`, `anioFabricacion` y `encendido`, permitiendo que las clases hijas accedan directamente a la identidad básica del rodado.
* **Constructor**: Inicializa los datos comunes del vehículo y configura el estado inicial del motor en apagado (`false`).
* **Métodos operativos**:
* `encender()` / `apagar()`: Permiten alternar y actualizar el estado operativo del motor, imprimiendo un mensaje de confirmación por consola.
* `mostrarInformacion()`: Muestra de forma estructurada los datos generales de identificación del vehículo.




* **`AutoParticular`**: Extiende de `Vehiculo` para modelar automóviles enfocados en el transporte de pasajeros.
* **Atributo privado (`private`)**: `cantidadPuertas`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura el número de puertas.
* **Método específico**: `mostrarPuertas()` para imprimir la cantidad de puertas del automóvil.


* **`Camion`**: Extiende de `Vehiculo` para modelar vehículos pesados de carga.
* **Atributo privado (`private`)**: `capacidadCarga` (en toneladas).
* **Constructor**: Utiliza `super(...)` y asigna la capacidad máxima de carga.
* **Método específico**: `mostrarCapacidad()` para reportar el tonelaje soportado.


* **`Motocicleta`**: Extiende de `Vehiculo` para modelar vehículos de dos ruedas.
* **Atributo privado (`private`)**: `cilindrada` (en centímetros cúbicos).
* **Constructor**: Utiliza `super(...)` y asigna la cilindrada del motor.
* **Método específico**: `mostrarCilindrada()` para detallar la potencia del motor.


* **`Main`**: Punto de entrada del programa. Instancia un automóvil, un camión y una motocicleta con sus respectivos parámetros específicos, invoca la visualización de su información general y particular, y acciona el encendido de los motores, imprimiendo los resultados por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización de Atributos por Herencia:** La identidad común de los vehículos (`patente`, `marca`, `anioFabricacion`, `encendido`) se centraliza en la superclase `Vehiculo`, evitando duplicar código en las clases derivadas.
2. **Especialización de Componentes:** Cada subclase introduce sus propias propiedades exclusivas (`cantidadPuertas`, `capacidadCarga`, `cilindrada`) sin alterar la estructura base del transporte.
3. **Control Centralizado de Estado:** Los métodos operativos como `encender()` y `apagar()` son heredados y compartidos de forma uniforme por todos los tipos de vehículos, garantizando un comportamiento homogéneo.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== AUTOMÓVIL ===
Patente: AB123CD
Marca: Toyota
Año: 2022
Encendido: false
Cantidad de puertas: 4
El vehículo está encendido.

=== CAMIÓN ===
Patente: AC456EF
Marca: Mercedes-Benz
Año: 2020
Encendido: false
Capacidad de carga: 15.5 toneladas
El vehículo está encendido.

=== MOTOCICLETA ===
Patente: A123BCD
Marca: Honda
Año: 2023
Encendido: false
Cilindrada: 150 cc
El vehículo está encendido.

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía y Extensibilidad de Clases:** Modelado del dominio de transporte mediante una arquitectura limpia de herencia (`Vehiculo` como superclase de `AutoParticular`, `Camion` y `Motocicleta`).
* **Encapsulamiento y Ocultamiento:** Protección de los atributos específicos de cada subclase (`private`), exponiéndolos de forma segura mediante métodos de comportamiento especializados.
* **Diseño Modular:** Clara separación entre la lógica del dominio de vehículos y la ejecución de casos de prueba simulados en el cliente (`Main`).
