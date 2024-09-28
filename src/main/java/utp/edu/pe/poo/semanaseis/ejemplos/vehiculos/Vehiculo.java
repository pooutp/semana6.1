

package utp.edu.pe.poo.semanaseis.ejemplos.vehiculos;
class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: "
                + modelo + ", Año: " + año);
    }
}