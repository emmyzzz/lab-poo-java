package lab03;

import java.util.Scanner;

public class Conceito {
    // Execute no terminal
    // java lab03/Condicionais3.java
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        System.out.println("Qual conceito:");
        var nota = sc.next();
        switch (nota) {
            case "A" -> System.out.println("Nota: 100");
            case "B" -> System.out.println("Nota: 90");
            case "C" -> System.out.println("Nota: 80");
            case "D" -> System.out.println("Nota: 70");
            case "E" -> System.out.println("Nota: 60");
        }
        sc.close();
    }
}