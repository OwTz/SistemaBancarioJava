
package Accounts;

/**
 *
 * @author owtz
 */
public  abstract class Pessoa implements InterfaceAcoes{
    private String NOME;
    private float DINHEIRO;
    private String Accounttype;
    private boolean status;
    
    public Pessoa(){
        
        this.setStatus(true);
       
    }
    /* métodos getters e setters */

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public float getDINHEIRO() {
        return DINHEIRO;
    }

    public void setDINHEIRO(float DINHEIRO) {
        this.DINHEIRO = DINHEIRO;
    }

    public String getAccounttype() {
        return Accounttype;
    }

    public void setAccounttype(String Accounttype) {
        this.Accounttype = Accounttype;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void status(){
        System.out.println(" ~~~~~~~~~~ MENU ~~~~~~~~~~");
        System.out.println(" nome: "+this.getNOME());
        System.out.println(" quantidade de Dinheiro em R$ "+this.getDINHEIRO());
        System.out.println(" estado da conta atualmente : ");
        System.out.print(this.isStatus()?"ativa":"desativada");
    }
    
}
