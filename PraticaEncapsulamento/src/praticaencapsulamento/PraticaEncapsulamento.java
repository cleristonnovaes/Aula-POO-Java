
package praticaencapsulamento;

/**
 *
 * @author cleriston
 */
public class PraticaEncapsulamento {

    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
       
       c.abrirMenu();
       c.maisVolume();
       c.menosVolume();
       c.play();   
       c.pause();
    }
    
}
