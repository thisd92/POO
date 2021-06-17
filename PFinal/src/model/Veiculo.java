package model;

/**
 *
 * @author Thiago
 */
public abstract class Veiculo {
 
    public String nome;
    public String marca;
    public double capacidadeTanque;
    public String combustivel;
    public String ano;

    public Veiculo(){
        
    }
    
    public Veiculo(String nome, String marca, String ano, String combustivel) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.combustivel = combustivel;
    }
    
    public abstract void adicionar();
    
    public abstract void excluir();
    
    public String getLista(){
        return "Veiuclo: " + nome + "\nMarca: " + marca + "\nAno: " + ano
                + "\nCapaciade do Tanque: " + capacidadeTanque
                + "\nTipo de Combustivel: " + combustivel;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
}
