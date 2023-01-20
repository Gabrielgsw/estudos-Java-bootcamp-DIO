

import java.util.Scanner;
public class exercicioFatorial {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = scan.nextInt();
        int contador = 1;
        int fatorial = 0;        
        
        while(contador<numero){
              fatorial = numero*(numero-contador);
            
            contador++;
        }

            System.out.println(numero+" ! = "+fatorial);

    }


}
