package lab02;
public class Entrada1 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args) {
        var n0 = Integer.parseInt (args[0]);
        var n1 = Integer.parseInt (args[1]);
        var soma = n0 + n1;

        System.out.println("A soma é: " + soma );
    }
}
