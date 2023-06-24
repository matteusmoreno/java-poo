public class Professor {

    private String nomeProfessor;
    private String materiaProfessor;
    private boolean empregado = false;

    //Construtor:
    public Professor(String nomeProfessor, String materiaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.materiaProfessor = materiaProfessor;
    }

    //Getters:
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getMateriaProfessor() {
        return materiaProfessor;
    }

    public boolean isEmpregado() {
        return empregado;
    }

    //Setters:
    public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

    //Métodos:
    public void materiaQueProfessorLeciona() {
        System.out.println(this.nomeProfessor + " leciona " + this.materiaProfessor);
    }

    public void trocaMateria(String novaMateria) {
        this.materiaProfessor = novaMateria;
        System.out.println(this.nomeProfessor + " agora é professor(a) de " + novaMateria);
    }
}
