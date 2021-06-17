package model;

/**
 *
 * @author Thiago
 */
public class Diesel extends Veiculo{
    
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

}
