package es.medac;

import java.util.ArrayList;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private ArrayList<Persona> titulares;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.titulares = new ArrayList<>();
    }

    public void agregarTitular(Persona titular) {
        if (titular.mayorEdad()) {
            titulares.add(titular);
        } else {
            System.out.println("Solo personas mayores de edad pueden ser titulares.");
        }
    }

    public boolean retirarSaldo(String dniTitular, double cantidad) {
        for (Persona titular : titulares) {
            if (titular.getDni().equals(dniTitular)) {
                if (cantidad <= saldo) {
                    saldo -= cantidad;
                    return true;
                }
            }
        }
        return false;
    }

    public void depositarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}