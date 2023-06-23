import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
    Cliente matteus = new Cliente("Matteus");
    Cliente rian = new Cliente("Rian");
    Conta conta = new Conta(matteus, 0, 2122, 18152);

    @Test
    public void DeveRetornarDeposito(){
        double valorDoDeposito = 100.0;
        conta.deposita(valorDoDeposito);

        Assertions.assertEquals(valorDoDeposito, conta.getSaldo());
    }

    @Test
    public void DeveRetornarSaque() {
        double valorDoSaque = 100;
        conta.saca(valorDoSaque);

        Assertions.assertEquals(0, conta.getSaldo());
    }
    @Test
    public void DeveRetornarTransferencia() {
        Conta conta1 = new Conta(matteus, 100, 2122, 18152);
        Conta conta2 = new Conta(rian, 0, 2122, 18154);
        double valorDaTransferencia = 100.0;
        conta1.transfere(valorDaTransferencia, conta2);

        Assertions.assertEquals(0, conta1.getSaldo());
        Assertions.assertEquals(100.0, conta2.getSaldo());
    }


}
