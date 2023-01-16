import java.util.Scanner;

import javax.swing.undo.StateEdit;
public class exercicio2nota{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        Double nota;
        do{
            System.out.print("Digite a nota: ");
            nota = scan.nextDouble();
            if(nota>=7 && nota<=10){
            System.out.println("Parabéns, voce foi aprovado com a nota: "+nota);                  
            } else if(nota<7 && nota>=0){
            System.out.println("Voce foi reprovado com a nota: "+nota);
            }
        } while(nota>10 || nota<0);


       
            
    }
}