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
        
        Circulo areaCirculo = new Circulo();
        Quadrado areaQuadrado = new Quadrado();
        Retangulo areaRetangulo = new Retangulo();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        
        areaCirculo.setRaio(raio);
        
        System.out.println("O valor da area do circulo e: " + areaCirculo.area() + "\n");
        System.out.println("O valor do perimetro do circulo e: " + areaCirculo.perimetro()+ "\n");
        
        System.out.println("------------------------------------");
        
        System.out.println("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = sc.nextDouble();
        
        areaQuadrado.setLado(ladoQuadrado);
        
        System.out.println("O valor da area do quadrado e: " + areaQuadrado.area() + "\n");
        System.out.println("O valor do perimetro do quadrado e: " + areaQuadrado.perimetro()+ "\n");

        System.out.println("------------------------------------");
        
        System.out.println("Digite o valor do lado do retangulo: ");
        double ladoRetangulo = sc.nextDouble();
        areaRetangulo.setLado(ladoRetangulo);
        
        System.out.println("Digite o valor da base do retangulo: ");
        double baseRetangulo = sc.nextDouble();
        areaRetangulo.setBase(baseRetangulo);
               
        System.out.println("O valor da area do retangulo e: " + areaRetangulo.area() + "\n");
        System.out.println("O valor do perimetro do retangulo e: " + areaRetangulo.perimetro()+ "\n");        
    }
    
    
}