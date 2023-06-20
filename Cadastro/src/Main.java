import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Menu cep = new Menu();
        ConsultaCep consulta = new ConsultaCep();

        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep.menu());
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando Aplicação");
        }


    }
}
