public class Hotel {
    private Habitacion[] habitaciones;
    private int cantidadHabitaciones;

    // Constructor
    public Hotel(int cantidad) {
        habitaciones = new Habitacion[cantidad];
        cantidadHabitaciones = 0;
    }

    // Método para agregar habitación
    public void agregarHabitacion(Habitacion habitacion) {
        if (cantidadHabitaciones < habitaciones.length) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
            System.out.println("Habitación " + habitacion.getNumero() + " agregada.");
        } else {
            System.out.println("No hay espacio para agregar más habitaciones.");
        }
    }

    // Método para mostrar las habitaciones
    public void mostrarHabitaciones() {
        System.out.println("Estado de las habitaciones:");
        for (int i = 0; i < cantidadHabitaciones; i++) {
            Habitacion hab = habitaciones[i];
            if (hab.isOcupada()) {
                System.out.println("Habitación " + hab.getNumero() + " está ocupada por: " + hab.getCliente());
            } else {
                System.out.println("Habitación " + hab.getNumero() + " está libre.");
            }
        }
    }
}
