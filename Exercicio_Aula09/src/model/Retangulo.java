package model;

/**
 *
 * @author Thiago
 */
public class Retangulo extends FiguraGeometrica{
        
    public double lado;
    public double base;
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public void setBase(double base){
        this.base = base;    
    }
    
    
    @Override
    public double area() {
        return lado * base;
       
    }

    @Override
    public double perimetro() {
        return lado+base+lado+base;
    }
}
