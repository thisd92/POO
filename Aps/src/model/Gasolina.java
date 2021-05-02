package model;

/**
 *
 * @author Thiago
 */
public class Gasolina extends Veiculo{
    
    public static final double VALOR_GASOLINA = 5.76;
    
    public Gasolina(){
        
    }
    
    public Gasolina(String nome, String marca, int capacidadeTanque, String combustivel){
        super (nome, marca, capacidadeTanque, combustivel);
    }
    
    @Override
    public void adicionar() {
    System.out.println("Veiculo gasolina adicionado");    
    }

    @Override
    public void excluir() {
        System.out.println("Veiculo gasolina excluido");
    }
    @Override
    public double calculoCombustivel() {
        return super.calculoCombustivel()* VALOR_GASOLINA;
    }

}