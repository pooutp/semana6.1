
package utp.edu.pe.poo.cuentas;

public class CuentaCorriente extends Cuenta{
    protected final static double COMISIONMOVIMIENTO = 12;
    
    @Override
    public boolean retirarCuenta(double montoRetirar) {
        return super.retirarCuenta(
                montoRetirar+CuentaCorriente.COMISIONMOVIMIENTO); 
    }

    @Override
    public void abonarCuenta(double montoAbonar) {
        super.abonarCuenta(
                montoAbonar-CuentaCorriente.COMISIONMOVIMIENTO);
    }

    @Override
    public boolean transferirCuentaOtroBanco(String numeroCCI, 
            String banco, double montoTransferir) {
        return super.transferirCuentaOtroBanco(numeroCCI, 
                banco, montoTransferir+CuentaCorriente.COMISIONMOVIMIENTO); 
    }

    @Override
    public boolean transferirEntreCuentas(String numeroCuenta, 
            double montoTransferir) {
        return super.transferirEntreCuentas(numeroCuenta, 
                montoTransferir+CuentaCorriente.COMISIONINTERBANCARIA); 
    }   
}
