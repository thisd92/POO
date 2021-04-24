package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Fisica extends Pessoa{
    
    public String cpf;
    
    public Fisica(){
        super();
    }
    
    
    public Fisica(int id, String nome,
            String end, String fone, String cpf){
        super(id, nome, end, fone);
        this.cpf = cpf;
    }

    @Override
    public void cadastrar() {
        //super.cadastrar();
        String texto = "Nome: " + this.nome + "\n" + 
                "Telefone: " + this.getTelefone() + "\n" + 
                "CPF: " this.cpf;
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
