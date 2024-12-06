public class Habitacion {
    private int numero;
    private double costoPorNoche;
    private boolean ocupada;
    private Persona cliente;

    // Constructor
    public Habitacion(int numero, double costoPorNoche) {
        this.numero = numero;
        this.costoPorNoche = costoPorNoche;
        this.ocupada = false;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCostoPorNoche() {
        return costoPorNoche;
    }

    public void setCostoPorNoche(double costoPorNoche) {
        this.costoPorNoche = costoPorNoche;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    // reservar habitación
    public void reservar(Persona cliente) {
        if (!ocupada) {
            this.cliente = cliente;
            ocupada = true;
            System.out.println("Habitación " + numero + " reservada para: " + cliente.getNombre());
        } else {
            System.out.println("La habitación " + numero + " ya está ocupada.");
        }
    }

    //  liberar  habitación
    public void liberar() {
        if (ocupada) {
            System.out.println("Habitación " + numero + " liberada.");
            cliente = null;
            ocupada = false;
        } else {
            System.out.println("La habitación " + numero + " ya está libre.");
        }
    }
}
