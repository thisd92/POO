package aula05;

public class Circulo {
    public double raio;
    private double diametro;
    
    public static double calcularArea(double _raio){
        return Calculo.CalcularAreaCirculo(_raio);
    }
    
    public double getArea(){
        return Calculo.CalcularAreaCirculo(this.raio);
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getDiametro(){
        return raio*2;
    }
    
    public void setDiametro(){
        this.diametro = raio * 2;
    }
}
