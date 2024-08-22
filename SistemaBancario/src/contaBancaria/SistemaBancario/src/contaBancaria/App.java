
package contaBancaria;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("Digite o número da sua conta1");
        conta.setNumero(teclado.next());
        System.out.println("Digite o titular da sua conta1");
        conta.setTitular(teclado.next());
        System.out.println("Digite o número da sua conta2");
        conta2.setTitular(teclado.next());
        System.out.println("Digite o titular da sua conta2");
        conta2.setTitular(teclado.next());
        
        conta2.depositar(1000);
        conta2.depositar(700);
        System.out.println("a)");
        System.out.println("Deposito feito pela conta2, de 1.000R$ e 700R$");
        System.out.println("");
        
        System.out.println("b)");
        System.out.println("Deposito feito pela conta1, de 5.000R$");
        
  
        
    }
}
