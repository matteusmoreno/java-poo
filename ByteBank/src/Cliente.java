public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    //Construtor:
    public Cliente(String nome) {
        this.nome = nome;
    }

    //Getters & Setters:
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    //Métodos:
    public void informacoesPessoais() {
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Profissão: " + this.profissao);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
