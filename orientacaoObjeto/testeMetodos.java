package orientacaoObjeto;
import java.util.*;

public class testeMetodos {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);	
        testeMetodos.getEncher(5);
    }

    public static int getEncher(int valorGasolina){
        Scanner scan = new Scanner(System.in);	
        System.out.print("Qual a capacidade do tanque do carro? ");
        int capacidadeTanque = scan.nextInt();
        int valorTanque = valorGasolina*capacidadeTanque;
        return valorTanque;


    }
}
