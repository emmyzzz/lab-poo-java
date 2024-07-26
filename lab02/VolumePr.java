package lab02;

public class VolumePr{
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args){
    var areab = Float.parseFloat(args[0]);
    var height = Float.parseFloat(args[1]);
    var div = 3;
    var volume = areab * height / div;

    System.out.println("O volume para este  pirâmide é: " + volume);
    }

}