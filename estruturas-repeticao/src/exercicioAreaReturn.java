public class exercicioAreaReturn {
    
    public static void main(String[]args){
        double areaQuadrado = exercicioAreaReturn.calcularArea(3);
        System.out.println("A área do quadrado é: "+areaQuadrado);

        double areaRetangulo = exercicioAreaReturn.calcularArea(3,3);
        System.out.println("A área do retangulo é: "+areaRetangulo);

        double areaTrapezio = exercicioAreaReturn.calcularArea(3,3,3);
        System.out.println("A área do trapézio é: "+areaTrapezio);
        
    }

    public static double calcularArea(double lado1, double lado2){
	    double area = lado1 * lado2;
		return area;

    }

    public static double calcularArea(double lado){
        double area = lado * lado;
        return area;
    }

    public static double calcularArea(double lado1, double lado2, double lado3){
        double area = ((lado1+lado2)*lado3)*1/2;
        return area;

    }

}
