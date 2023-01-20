

public class exercicioArea {

    public static void main(String[]args){ 
        exercicioArea.calcularArea(5);
        exercicioArea.calcularArea(5,2);
        exercicioArea.calcularArea(5,4,3);
    }

    public static void calcularArea(double lado1, double lado2){
	    double area = lado1 * lado2;
		System.out.print("O valor da área é: "+area);

    }

    public static void calcularArea(double lado){
        double area = lado * lado;
        System.out.print("O valor da área é: "+area);
    }

    public static void calcularArea(double lado1, double lado2, double lado3){
        double area = ((lado1+lado2)*lado3)*1/2;
        System.out.print("O valor da área é: "+area);

    }

}
