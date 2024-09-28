package utp.edu.pe.poo.semanaseis;
import utp.edu.pe.poo.cliente.Cliente;
import utp.edu.pe.poo.cliente.LecturaCliente;
import utp.edu.pe.poo.cuentas.CuentaOperaciones;
import utp.edu.pe.poo.pantalla.Pantalla;
import utp.edu.pe.poo.semanaseis.ejemplos.vehiculos.Automovil;
import utp.edu.pe.poo.semanaseis.ejemplos.vehiculos.Camion;
import utp.edu.pe.poo.semanaseis.ejemplos.vehiculos.Moto;

public class SemanaSeis {

    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Cliente cliente = new Cliente();
        boolean apagado=true;
        int opcion;
   
        String[] opciones = {"Crear Cliente [1]",
            "Operaciones [2]","Salir [3]"};
        
        do{
            opcion = pantalla.Menu(
                    "Cajero automático", opciones);             
            switch(opcion){
                case 1:                    
                    cliente = LecturaCliente.lecturaCliente();
                    break;
                case 2:   
                    CuentaOperaciones.hacerOperaciones(cliente);
                    break;
                case 3:                   
                    apagado=false;
                    break;
            }            
        } while(apagado);
    }
    
    public void ejemplos(){
        Automovil miAuto = new Automovil("Toyota", 
                "Corolla", 2020, 4);
        Moto miMoto = new Moto("Harley-Davidson", 
                "Street 750", 2019, false);
        Camion miCamion = new Camion("Mercedes-Benz",
                "Actros", 2021, 18);
        System.out.println("Información del Automóvil:");
        miAuto.mostrarInfo();
        System.out.println("\nInformación de la Moto:");
        miMoto.mostrarInfo();
        System.out.println("\nInformación del Camión:");
        miCamion.mostrarInfo();
    }
}


