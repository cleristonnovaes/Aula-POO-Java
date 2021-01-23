
package praticapoo;
/**
 * @author cleriston
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!!");
        
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta não pode ser fechada por que ainda tem dinheiro.");
        }else if (this.getSaldo() < 0){
            System.out.println("A conta não pode ser fechada, por que tem débito.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em um conta fechada!");
        }
        
    }
    
    public void sacar(float v){
       if(this.isStatus()){
           if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
           }else{
               System.out.println("Saldo insuficiente na conta!");
           }
       }else{
           System.out.println("Impossível sacar de uma conta fechada!");
       } 
    }
    public void pagarMensal(int v){
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if(this.isStatus()){
            if(this.getSaldo() > v){
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível pagar uma conta fechado");
        }
    }
    
    public ContaBanco() {
        this.saldo = 0; 
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void estadoAtual(){
        System.out.println("---------------------------------------");
        System.out.println("Suas informações bancárias atualizadas");
        System.out.println("Seu número de conta: " + this.getNumConta());
        System.out.println("O tipo de conta: " + this.getTipo());
        System.out.println("O nome do Dono: "+ this.getDono());
        System.out.println("O seu saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.isStatus());
    }
    
    
}
