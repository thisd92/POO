package aula05;

public class Calculo {
    
    public static final double PI = 3.141592;
    
    public static double CalcularAreaCirculo(double raio){
        double area = PI * (Math.pow(raio, 2));
        return area;
    }
}
