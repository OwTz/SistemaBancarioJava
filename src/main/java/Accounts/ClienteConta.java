
package Accounts;

/**
 *
 * @author Sérgio , Linkedin  https://www.linkedin.com/in/sergiotechenicalti/
 * Github : https://github.com/OwTz
 */
public class ClienteConta extends Pessoa{
    
    private String tipoc;
    
    public ClienteConta(String nome){
        super();
        this.setNOME(nome);
        this.setDINHEIRO(0);
    }
    
    
    @Override
    public void deposito(float valor){
        
        this.setDINHEIRO(this.getDINHEIRO() + valor);
        
    }
    @Override
    public void saque(float valor){
        if(this.isStatus()){
         
            if(this.getDINHEIRO() < valor){
            System.out.print("impossível completar a transação");
             } else {
                System.out.print("Transação completada com sucesso! ");
                this.setDINHEIRO(this.getDINHEIRO() - valor);
        }
        } else {
            System.out.println("conta inativa");
        }
        
    }
    @Override
    public void congelar(){
        if(this.isStatus()){
            
            this.setStatus(false);
            
        } else {
            
            this.setStatus(true);
            
        }
    }
    
    public void setTipoc(String tipoc){
        
        this.tipoc = tipoc;
        
    }
    public String getTipoc(){
        return this.tipoc;
    }
}
