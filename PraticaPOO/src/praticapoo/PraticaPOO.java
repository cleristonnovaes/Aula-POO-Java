package praticapoo;
/**
 *
 * @author cleriston
 */
public class PraticaPOO {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(11);
        conta1.setDono("Jubileu");
        conta1.abrirConta("CC");
        
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(22); 
        conta2.setDono("Creuza");
        conta2.abrirConta("CP");
        
        
        conta1.depositar(300);
        conta2.depositar(500);
        conta2.sacar(100);
        
        conta1.sacar(350);
        conta1.fecharConta();
        
        conta1.estadoAtual();
        conta2.estadoAtual();     
       
        
        
        
    }
    
}
