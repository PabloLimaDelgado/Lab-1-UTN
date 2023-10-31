/*10. Crea una clase CuentaBancaria con atributos como saldo y número
de cuenta */

package Clases;

public class CuentaBancaria {
    public int saldo;
    private int numero;
    public CuentaBancaria(int saldo, int numero){
        this.saldo = saldo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*11. Define métodos para depositar y retirar dinero de la cuenta.*/

     public int depositarDinero(int sumaDepositada){
         return saldo += sumaDepositada;
     }

    public int retirarDinero(int sumaRetirada){
        return saldo -= sumaRetirada;
    }
}
