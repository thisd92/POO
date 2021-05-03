package model;

import javax.swing.JOptionPane;

public class Perecivel extends Produto{

    public double temperaturaRecomendada;
    public static final double TEMPERATURA_MINIMA = -18.5;

    public Perecivel() {
    
    }

    public Perecivel(String nome) {
        super(nome);
    }

    public Perecivel(double temperaturaRecomendada, String nome) {
        super(nome);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public Perecivel(double temperaturaRecomendada, String nome, double preco, double quantidade) {
        super(nome, preco, quantidade);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    
    
    
    @Override
    public void excluir() {
        this.zerarEstoque();
        System.out.println("Produto perecivel " + nome + "excluido!");
    }

    @Override
    protected void zerarEstoque() {
        this.setQuantidade(0.0);
    }

    @Override
    public void imprimir() {
        String texto = "Nome: " + nome + "\nPreco: " + preco 
                + "\nQuantidade: " + this.getQuantidade()
                + "\nTemperatura Recomendada: " + temperaturaRecomendada;
        JOptionPane.showMessageDialog(null, texto);
    }

    @Override
    public String getInformacao() {
        return "{ 'nome': '" + nome + "' , 'preco': " 
                + preco + " , 'quantidade': " + this.getQuantidade() 
                + " , " + "temperatura recomendada: " + temperaturaRecomendada + " } ";
    }
    
    

}
