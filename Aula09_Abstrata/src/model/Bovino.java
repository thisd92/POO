package model;

public class Bovino extends Mamifero{

    @Override
    public void amamentar() {
        System.out.println(nome + "amamentou!");
        
    }

    @Override
    public void cadastrar() {
        System.out.println(nome + "cadastrado!");
    }

    @Override
    public void editar() {
        System.out.println("Bovino" + nome + "foi editado");
    }
    
    
    
}
