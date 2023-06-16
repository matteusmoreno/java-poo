package conta.corrente;

public class ContaCorrente {
    private String titular;
    private int numeroDaConta;
    private String agencia;
    private String dataDeAbertura;
    private double saldo;

    //Construtor
    public ContaCorrente(String titular, int numeroDaConta, String agencia, String dataDeAbertura, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.dataDeAbertura = dataDeAbertura;
        this.saldo = saldo;
    }

    //Setters & Getters:

    public double getSaldo() {
        return saldo;
    }

    //Mètodos:
    public void sacar(double valor){
        if (saldo > valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }

    public void  depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito não pode ser negativo");
        }
    }
    public void extrato(){
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroDaConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Data de Abertura da Conta: " + this.dataDeAbertura);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    public double rendimento(){
        return this.saldo * 0.1;
    }
}

