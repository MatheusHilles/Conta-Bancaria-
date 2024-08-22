/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author mathillesheim
 */
public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        
        if( valor > 0){
            this.saldo = saldo + valor;
        }
}
    public void sacar(double valor) {
        
        if( valor > 0 && valor <= saldo){
            this.saldo = saldo - valor;
           
        }
    }
    
    public void transferir(double valor, ContaBancaria conta) {
        if( this.saldo >= valor && valor > 0) {
            this.saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
            
        }
        
    }

    
}
