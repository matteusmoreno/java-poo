public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Mufasa");
        cachorro1.setIdade(7);
        cachorro1.setRaca("Chow Chow");
        cachorro1.mostrarFicha();
        cachorro1.acordaAnimal();
        cachorro1.fazAuAu();
        cachorro1.dormeAnimal();
        cachorro1.fazAuAu();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Gatos gato1 = new Gatos();
        gato1.setNome("Flu Flu");
        gato1.setIdade(4);
        gato1.setRaca("Siamês");
        gato1.mostrarFicha();
        gato1.fazMiau();
        gato1.dormeAnimal();
        gato1.fazMiau();
        gato1.acordaAnimal();
        gato1.fazMiau();
        gato1.ronronar();
        gato1.dormeAnimal();
        gato1.ronronar();
    }
}
