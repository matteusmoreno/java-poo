import java.util.Scanner;

public class Menu {

    public String menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu CEP: ");
        return entrada.nextLine();
    }

}
