
package utp.edu.pe.poo.semanaseis.ejemplos.vehiculos;
public class Automovil extends Vehiculo {
    private int puertas;
    public Automovil(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año); // Llamada al constructor de la superclase
        this.puertas = puertas;
    }
    // Sobrescribiendo el método mostrarInfo
    @Override
    public void mostrarInfo() {
        // Llama al método mostrarInfo de la superclase
        super.mostrarInfo(); 
        System.out.println("Puertas: " + puertas);
    }
}


