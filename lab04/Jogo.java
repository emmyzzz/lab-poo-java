package lab04;
import java.util.Scanner;
public class Jogo{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        /**
         * while
         * Executa um bloco de código enquanto uma condição específica for verdadeira.
         */
        System.out.println("Vamos testar sua sorte? Digite um número");
        var usuario = 0;
        var num = 56;
        var contador = 0;
        
        while (usuario != num ) {
            System.out.println("Vamos testar sua sorte? Digite um número");
            usuario = sc.nextInt();
            contador += 1;

            if (usuario > num ) {
                System.out.println("O número informado é maior que a resposta");
            }

           else if  (usuario < num ) {
            System.out.println("O número informado é menor que a resposta");
           } 
           else{
            System.out.println("Voce ganhou!!");
           }    
        }
    }
}   
