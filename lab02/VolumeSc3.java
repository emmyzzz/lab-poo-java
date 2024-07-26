package lab02;

import java.util.Scanner;
public class VolumeSc3{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Qual a medida o raio do cilindro?");
        var raio = sc.nextDouble();
        System.out.print("Qual a medida da altura do cilindro?");
        var height = sc.nextDouble();
        var volume = Math.PI * Math.pow(raio, 2) * height;


        System.out.println("O volume para este cilindro é: "  + volume + "cm³");

        sc.close();
    }
}