
package Accounts;

public class TesteDeclass {
    public static void main(String[] args) {
         ClienteConta novaconta = new ClienteConta("Sérgio");
         novaconta.status();
         novaconta.deposito(100f);
         novaconta.status();
         novaconta.saque(110f);
         novaconta.status();
         novaconta.congelar();
         novaconta.status();
    }
   
}
