package lab02;

import java.util.Scanner;
public class VolumeSc1{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Qual a medida da lateral do cubo?");
        var lado = sc.nextDouble();
        var volume = Math.pow(lado,3);

        System.out.println("O volume para este cubo é: "  + volume + "cm³");
    }
}

   