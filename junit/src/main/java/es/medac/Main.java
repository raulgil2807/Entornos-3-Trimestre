package es.medac;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        Persona titular2 = new Persona("María", "87654321B", 17); // menor de edad
        
        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("1234567890");
        
        // Agregar titulares a la cuenta
        cuenta.agregarTitular(titular1);
        cuenta.agregarTitular(titular2); // Esto debería imprimir un mensaje de error
        
        // Depositar saldo inicial
        cuenta.depositarSaldo(1000);
        
        // Retirar saldo con DNI válido
        boolean retiroExitoso = cuenta.retirarSaldo("12345678A", 500);
        if (retiroExitoso) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo());
        } else {
            System.out.println("No se pudo retirar saldo.");
        }
    }
}
