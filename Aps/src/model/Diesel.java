package model;

/**
 *
 * @author Thiago
 */
public class Diesel extends Veiculo{
    
    public static final double VALOR_DIESEL = 3.86;
    
    public Diesel(){
        
    }
    
    public Diesel(String nome, String marca, int capacidadeTanque, String combustivel){
        super (nome, marca, capacidadeTanque, combustivel);
    }
    
    @Override
    public void adicionar() {
        System.out.println("Veiculo diesel adicionado");
    }

    @Override
    public void excluir() {
        System.out.println("Veiculo diesel excluido");
    }

    @Override
    public double calculoCombustivel() {
        return super.calculoCombustivel()* VALOR_DIESEL;
    }
    
}
