package view;

import java.util.Scanner;
import model.Circulo;
import model.Quadrado;
import model.Retangulo;
/**
 *
 * @author Thiago
 */
public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        
        circulo.setRaio(raio);
        
        System.out.println("O valor da area do circulo e: " + circulo.area() + "\n");
        System.out.println("O valor do perimetro do circulo e: " + circulo.perimetro()+ "\n");
        
        System.out.println("------------------------------------");
        
        System.out.println("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = sc.nextDouble();
        
        quadrado.setLado(ladoQuadrado);
        
        System.out.println("O valor da area do quadrado e: " + quadrado.area() + "\n");
        System.out.println("O valor do perimetro do quadrado e: " + quadrado.perimetro()+ "\n");

        System.out.println("------------------------------------");
        
        System.out.println("Digite o valor do lado do retangulo: ");
        double ladoRetangulo = sc.nextDouble();
        retangulo.setLado(ladoRetangulo);
        
        System.out.println("Digite o valor da base do retangulo: ");
        double baseRetangulo = sc.nextDouble();
        retangulo.setBase(baseRetangulo);
               
        System.out.println("O valor da area do retangulo e: " + retangulo.area() + "\n");
        System.out.println("O valor do perimetro do retangulo e: " + retangulo.perimetro()+ "\n");        
    }
    
    
}