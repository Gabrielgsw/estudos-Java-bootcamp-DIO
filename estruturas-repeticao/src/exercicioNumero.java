/*Fazer um programa que peca N numeros inteiros,
calcule e mostre a quantidade de numeros pares e impares.
 
 */

import java.util.Scanner;
public class exercicioNumero {
    
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int quantidadeNumeros = scan.nextInt();

        int contador = 0;
        int par = 0;
        int impar = 0;

        while(contador<quantidadeNumeros){
            System.out.print("Digite um numero: ");
            int numero = scan.nextInt();
            if(numero%2==0){
                System.out.println("O numero " +numero+ " é par !");
                par++;
            } 
            else if((numero%2)!=0){ 
                System.out.println("O numero " +numero+ " é ímpar !");
                impar++;
            }
            contador++;

        System.out.println("A quantidade de números pares é: "+par);
        System.out.println("A quantidade de numeros impares é: "+impar);
        }

    }


}
