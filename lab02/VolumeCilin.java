package lab02;

public class VolumePr{
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args){
    var raio = Float.parseFloat(args[0]);
    var height = Float.parseFloat(args[1]);
    var volume = Math.PI * Math.pow( raio, 2) * height ;
    long resultado = Math.round(volume);
    System.out.println("O volume para este  cilindro é: " + resultado  );
    }

}