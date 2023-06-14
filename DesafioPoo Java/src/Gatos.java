public class Gatos extends Animal{

    public void fazMiau(){
        if (isStatus(true)){
            System.out.println("Miau Miau");
        } else {
            System.out.printf(" %s está dormindo. Não pode miar\n", getNome());
        }
    }
    public void ronronar(){
        if (isStatus(true)){
            System.out.printf("%s está ronronando\n", getNome());
        } else {
            System.out.printf("%s está dormindo, não pode ronronar", getNome());
        }
    }

}
