package praticaheranca;

/**
 *
 * @author cleriston
 */
public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println(this.nome + " está praticando os conceitos téoricos aprendidos em " + 
                this.getCurso());
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}
