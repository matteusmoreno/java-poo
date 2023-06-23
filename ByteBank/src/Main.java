public class Main {
    public static void main(String[] args) {

        Cliente matteus = new Cliente("Matteus");
        Conta conta = new Conta(matteus, 100, 2122, 18152);

        Cliente rian = new Cliente("Rian");
        Conta conta2 = new Conta(rian, 150, 2122, 259876);

        matteus.setCpf("140.676.027-74");
        matteus.setProfissao("Programador");

        matteus.informacoesPessoais();
        conta.extrato();
        conta.deposita(2451);
        conta.extrato();

        System.out.println("Total de Contas: " + Conta.getTotal());
    }
}
