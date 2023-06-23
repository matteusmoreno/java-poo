public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    //Construtor:
    public Conta(Cliente titular, double saldo, int agencia, int numero) {
        Conta.total++;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }


    //Getters:
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    //Métodos:
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if(valor > this.saldo) {
            System.out.println("Valor indisponível");
        } else {
            this.saldo -= valor;
        }
    }

    public void transfere(double valor, Conta destino) {
        if(valor > this.saldo) {
            System.out.println("Valor indisponível");
        } else {
            this.saldo -= valor;
            destino.deposita(valor);
        }
    }

    public void extrato() {
        System.out.println("Extrato da conta do " + this.titular);
        System.out.println("SALDO               R$" + this.saldo);
    }

}


