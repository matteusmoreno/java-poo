public class Escola {

    private String nomeEscola;
    private int quantidadeAlunos;
    private int quantidadeProfessores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    //Getters:
    public String getNomeEscola() {
        return nomeEscola;
    }

    //Métodos:
    public void matriculaAluno(Aluno aluno) {
        if (aluno.isMatricula()) {
            System.out.println("O aluno(a) " + aluno.getNomeAluno() + " já está matriculado");
        } else {
            System.out.println("O aluno(a) " + aluno.getNomeAluno() + " foi MATRICULADO na escola " + this.nomeEscola);
            this.quantidadeAlunos++;
            aluno.setMatricula(true);
        }
    }

    public void desmatriculaAluno(Aluno aluno) {
        if (!aluno.isMatricula()) {
            System.out.println("O aluno(a) " + aluno.getNomeAluno() + " não está matriculado nesta escola. Portanto, não é possível desmatricular");
        } else {
            System.out.println("O aluno(a) " + aluno.getNomeAluno() + " foi DESMATRICULADO da escola " + this.nomeEscola);
            this.quantidadeAlunos--;
            aluno.setMatricula(false);
        }
    }

    public void estaMatriulado(Aluno aluno) {
        if (aluno.isMatricula()) {
            System.out.println("Aluno(a) " + aluno.getNomeAluno() + " ESTÁ MATRICULADO");
        } else {
            System.out.println("Aluno(a) " + aluno.getNomeAluno() + " NÃO ESTÁ MATRICULADO");
        }
    }

    public void totalAlunos() {
        if (this.quantidadeAlunos == 1) {
            System.out.println("O total de alunos da escola " + this.nomeEscola + " é de: " + this.quantidadeAlunos + " aluno");
        } else {
            System.out.println("O total de alunos da escola " + this.nomeEscola + " é de: " + this.quantidadeAlunos + " alunos");
        }
    }

    public void contrataProfessor(Professor professor) {
        if (!professor.isEmpregado()) {
            System.out.println(professor.getNomeProfessor() + " foi contratado(a) pela escola " + this.nomeEscola);
            professor.setEmpregado(true);
            quantidadeProfessores++;
        } else {
            System.out.println(professor.getNomeProfessor() + " já está empregado e não pode ser contratado(a)");
        }
    }
    public void demiteProfessor(Professor professor) {
        if (professor.isEmpregado()) {
            System.out.println(professor.getNomeProfessor() + " foi demitido(a) da escola " + this.nomeEscola);
            professor.setEmpregado(false);
            quantidadeProfessores--;
        } else {
            System.out.println(professor.getNomeProfessor() + " não tem emprego e não pode ser demitido(a)");
        }
    }

    public void estaContratado(Professor professor) {
        if (professor.isEmpregado()) {
            System.out.println(professor.getNomeProfessor() + " está contratado(a) pela escola " + this.nomeEscola);
        } else {
            System.out.println(professor.getNomeProfessor() + " não está contratado");
        }
    }

    public void totalDeProfessores() {
        if (quantidadeProfessores == 1) {
            System.out.println("O total de professores da escola " + this.nomeEscola + " é de: " + this.quantidadeProfessores + " professor");
        } else {
            System.out.println("O total de professores da escola " + this.nomeEscola + " é de: " + this.quantidadeProfessores + " professores");
        }
    }


}
