package model;

/**
 *
 * @author Thiago
 */
public class Circulo extends FiguraGeometrica{

    public double raio;
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return (double) (Math.PI * raio);
       
    }

    @Override
    public double perimetro() {
        return (double) (2 * Math.PI * raio);
    }

    
}
