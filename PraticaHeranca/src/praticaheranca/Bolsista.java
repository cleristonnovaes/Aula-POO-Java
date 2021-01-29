package praticaheranca;

/**
 *
 * @author cleriston
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.nome);
        
    }
    
    @Override
    public void pagarMensal(){
        System.out.println(this.nome + " é bolsista e tem pagamento diferenciado");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
