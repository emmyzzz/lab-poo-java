package lab03;

public class Teste2 {
    public static void main(String[] args) {
        var lado = Float.parseFloat(args[0]);
        var volume = Math.pow(lado,3);

        if (lado <=0  ) {
            System.out.println("error");
        } else {
            System.out.println("O volume para este cubo é: "  + volume + "cm³");
    
        }
        
    }
}