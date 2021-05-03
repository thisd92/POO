package model;

public abstract class Produto {
    
    //constante
    public static final int DUZIA = 12;
    public static final double PRECO_MINIMO = 1.99;
    
    public String nome;
    protected double preco;
    private double quantidade;
    
    public Produto(){
        
    }
    
    public Produto(String nome){
        this.nome = nome;
    }  
    
    public Produto(double preco){
        this.preco = preco;
    }      
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(double quantidade, String nome){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }    
    
    public abstract void excluir();
    
    protected abstract void zerarEstoque();
    
    public abstract void imprimir();
    
    public String getInformacao(){
        return "{ 'nome': '" + nome + "' , 'preco': " 
                + preco + " , 'quantidade': " + quantidade + " }";
    }
    
    //Static permite chamar o metodo sem instanciar um objeto
    public static final double getCotacaoDollar(){
        return 5.34;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if(quantidade >= 0)
            this.quantidade = quantidade;
        else
            System.out.println("Quantidade não pode ser menor que 0");
    }
    
    
}
