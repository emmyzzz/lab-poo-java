package lab03;

import java.util.Scanner;

public class Conceito2 {
    // Execute no terminal
    // java lab03/Condicionais3.java
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Qual a sua nota?");
        var nota = sc.nextDouble();
    
        if (nota > 100) {
            System.out.println("Nota inválida");   
        }
        else if (nota >= 91 ) {
            System.out.println("Conceito A");
        }  
        else if (nota >= 81) {
            System.out.println("Conceito B");
        }
        else if (nota >= 71) {
            System.out.println("Conceito C");
        }
        else if (nota >= 61) {
            System.out.println("Conceito D");
        }
        else if (nota >= 0) {
            System.out.println("Conceito E");
        }
       
        }
    }
