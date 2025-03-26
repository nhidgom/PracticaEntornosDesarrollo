package tema3_ejerciciosIntegracion;

public class Ej4_ServicioPagos {
    private double saldo;

    public Ej4_ServicioPagos(double saldo){// El error estaba en que no había parámetros de entrada
        this.saldo = saldo; // Se inicializa el saldo con el parámetro introducido
    }

    public boolean procesarPago(double monto) {
        if (monto <= 0 || monto > saldo) {
            System.out.println("Pago rechazado. Verifique el monto.");
            return false;  
        }
        saldo -= monto;
        return true;  
    }
}

