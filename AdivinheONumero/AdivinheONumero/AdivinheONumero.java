package AdivinheONumero;
import java.util.Scanner;


public class AdivinheONumero {
	public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        
        double res = Math.random()*101;
        int resInt = (int) res;
        int valor = 0;
        int contador = 0;
        
        
        while(resInt != valor){
            System.out.println("Qual o valor correto? ");
            valor = scan.nextInt();
            
            if (valor < resInt){
                System.out.println("O valor que você digitou é inferior ao resultado");
            } else if (valor > resInt){
                System.out.println("O valor que você digitou é superior ao resultado");
            }
            
            contador++;
        }
        System.out.println("Parabéns, você acertou o número: " + resInt + " em " + contador + " tentativas");
        scan.close();
    }
}

