package model;

/**
 *
 * @author Thiago
 */
public class Quadrado extends FiguraGeometrica{
    
    public double lado;
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return lado * lado;
       
    }

    @Override
    public double perimetro() {
        return lado+lado+lado+lado;
    }
}
