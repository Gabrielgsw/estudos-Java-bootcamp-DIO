/* Desenvolver um gerador de tabuada

*/
import java.util.Scanner;
public class exercicioTabuada {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero que voce queira a tabuada: ");
        int numero = scan.nextInt();
        int contador = 1;
        System.out.println("A tabuada de "+numero+" é:");
        
        while(contador<=10){
            
            System.out.println(numero+" x "+contador+" = "+(numero*contador));
            contador++;
            
        }
    }
}
