package lab00;

import java.util.Scanner;
public class Avaliacao{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Escolha uma operação pela numeração: Soma (1); Subtração (2); Divisão (3); Multiplicação (4)");
        var opc = sc.nextInt();
        var adicao = 1;
        var subt = 2;
        var div = 3;
        var mult = 4;

        if (opc == adicao) {
            System.out.println("Me diga um número");
            var num1 = sc.nextInt();
            System.out.println("Me diga mais um número");
            var num2 = sc.nextInt();
            var soma = num1 + num2;
            System.out.println("O resultado é:" + soma);
        }
        else if (opc == subt) {
            System.out.println("Me diga um número");
            var num01 = sc.nextInt();
            System.out.println("Me diga mais um número");
            var num02 = sc.nextInt();
            var menos = num01 - num02;
            System.out.println("O resultado é:" + menos);
        }
        else if (opc == div) {
            System.out.println("Me diga um número");
            var numer = sc.nextInt();
            System.out.println("Me diga mais um número");
            var nume = sc.nextInt();
            var dvs = numer / nume;
            System.out.println("O resultado é:" + dvs);
        }
        else{
            System.out.println("Me diga um número");
            var numer1 = sc.nextInt();
            System.out.println("Me diga mais um número");
            var nume2 = sc.nextInt();
            var menos = numer1 * nume2;
            System.out.println("O resultado é:" + mult);
        }
       
    }
}