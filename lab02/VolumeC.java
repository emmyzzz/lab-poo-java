package lab02;

public class VolumeC{
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args){
    var lado = Float.parseFloat(args[0]);
    var volume = Math.pow(lado,3);

    System.out.println("O volume para este cubo é: " + volume);
    }

}