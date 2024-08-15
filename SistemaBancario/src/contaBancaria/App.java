
package contaBancaria;

public class App {
    
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria();
        
        conta.setSaldo(500000);
        conta.depositar(100);
        System.out.println(conta.getSaldo());
        conta.sacar(100);
        System.out.println(conta.getSaldo());
        
    }
}
