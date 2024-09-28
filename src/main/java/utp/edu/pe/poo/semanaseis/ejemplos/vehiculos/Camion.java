
package utp.edu.pe.poo.semanaseis.ejemplos.vehiculos;

public class Camion extends Vehiculo {
    private int capacidadCarga; 
    public Camion(String marca, String modelo, int año, int capacidadCarga) {
        super(marca, modelo, año); 
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}