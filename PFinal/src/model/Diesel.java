package model;

/**
 *
 * @author Thiago
 */
public class Diesel extends Veiculo{
    
    public Diesel(){
        
    }
    
    public Diesel(String nome, String marca, String ano, String combustivel){
        super (nome, marca, ano, combustivel);
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
