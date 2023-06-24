public class Aluno {

    private String nomeAluno;
    private int idade;
    private boolean matricula = false;

    //Construtor:
    public Aluno(String nomeAluno, int idade) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
    }

    //Getters:
    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isMatricula() {
        return matricula;
    }

    //Setters:
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }


    //Métodos:
}