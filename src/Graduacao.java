public class Graduacao extends Disciplina {
    
    public Graduacao (String nD, int cD, String pf) {
        super(nD, cD);
        this.setProfessor(pf);
    }
    
    //Atributos
    private String professor;
    
    //Métodos Getters e Setters
    public void setProfessor (String pf) {
        this.professor = pf;
    }
    
    public String getProfessor () {
        return this.professor;
    }
}

