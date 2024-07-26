package lab02;

import java.util.Scanner;
public class VolumeSc2{
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Qual a medida da lateral da piramide?");
        var base = sc.nextDouble();
        System.out.print("Qual a medida da altura da piramide?");
        var height = sc.nextDouble();
        var volume = base * height / 3 ;

        System.out.println("O volume para esta piramide é: "  + volume + "cm³");
    }
}