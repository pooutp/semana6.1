package utp.edu.pe.poo.semanaseis.ejemplos.vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año); 
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
    }
}


