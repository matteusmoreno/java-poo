public class Animal {
    private String nome;
    private String raca;
    private int idade;
    private boolean status;

    //Getters and Setters:

    public boolean isStatus(boolean b) {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos:
    public void mostrarFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }
    public void acordaAnimal(){
        status = true;
    }
    public void dormeAnimal(){
        status = false;
    }

}
