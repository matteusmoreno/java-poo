public class Primos {

    private int numero;

    public void primoOuNao(int valor){
        int numerosDivisiveis = 0;
        for (int i = 1; i < valor + 1; i++) {
            if (valor % i == 0){
                numerosDivisiveis++;
            }
        }
        if (numerosDivisiveis == 2) {
            System.out.println("O número " + valor + " É PRIMO");
        } else {
            System.out.println("O número " + valor + " NÃO É PRIMO");
        }
    }
}
