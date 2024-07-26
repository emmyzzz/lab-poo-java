package lab03;
import java.util.Scanner;

public class TesteIf {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Qual a medida da lateral do cubo?");
        var lado = sc.nextDouble();
        var volume = Math.pow(lado,3);
    
        if (lado <= 0) {
            System.out.println("Nao calculado");
        }  else {
          
            System.out.println("O volume para este cubo é: "  + volume + "cm³");
    
        }
        sc.close();
    }
}