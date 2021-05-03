package model;

/**
 *
 * @author Thiago
 */
public abstract class Cliente {
    
    public String nome;
    
    
    public Cliente(){
        
    }
    
    public abstract void imprimir();
    
    public String getInfo(){
        return "Nome: " + nome;
    }
    
    
    public abstract void cadastrar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
