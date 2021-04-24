package aula05;

public class Tela {

    public static void main(String[] args) {
        System.out.println("Valor do PI: " + Calculo.PI);
        System.out.println("Área do círculo com raio 2: " 
                + Calculo.CalcularAreaCirculo(2));
        Circulo c1 = new Circulo();
        c1.raio = 5;
        System.out.println("Área do círculo C1: " 
                + c1.getArea());
        System.out.println("Área do círculo static: " 
                + Circulo.calcularArea(34));
    }
    
}
