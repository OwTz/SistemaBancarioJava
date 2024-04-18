
package Accounts;

public enum Accounttype {
    ContaCorrente("ContaC"),ContaPoupanca("ContaP");

    private String conta;
    
    Accounttype(String conta){
      this.conta = conta;
    }
    
    
    public static Accounttype getContaCorrente() {
        return ContaCorrente;
    }

    public static Accounttype getContaPoupanca() {
        return ContaPoupanca;
    }
    
    
}
