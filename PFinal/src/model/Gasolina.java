package model;

/**
 *
 * @author Thiago
 */
public class Gasolina extends Veiculo{
    
    public Gasolina(){
        
    }
    
    public Gasolina(String nome, String marca, String ano, String combustivel){
        super (nome, marca, ano, combustivel);
    }
    
    @Override
    public void adicionar() {
    System.out.println("Veiculo gasolina adicionado");    
    }

    @Override
    public void excluir() {
        System.out.println("Veiculo gasolina excluido");
    }

}