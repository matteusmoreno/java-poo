public class Cachorro extends Animal {

    public void fazAuAu() {
        if (isStatus(true)) {
            System.out.println("Au Au Au Au");
        }else {
            System.out.printf("O %s está dormindo. Não pode latir\n", getNome());
        }

    }
}
