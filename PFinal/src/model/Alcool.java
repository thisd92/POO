package model;

/**
 *
 * @author Thiago
 */
public class Alcool extends Veiculo {
    
    public Alcool(){
        
    }
    
    public Alcool(String nome, String marca, int capacidadeTanque, String combustivel){
        super (nome, marca, capacidadeTanque, combustivel);
    }
    
    @Override
    public void adicionar() {
        System.out.println("Veiculo etanol adicionado");
    }

    @Override
    public void excluir() {
        System.out.println("Veiculo etanol excluido");
    }
    
    
}
