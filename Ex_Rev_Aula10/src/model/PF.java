package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class PF extends Cliente{
    
    public String cpf;
    public String dataNasc;

    @Override
    public void cadastrar() {
        System.out.println("Cliente" + nome + "cadastrado com sucesso");
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf 
                + "\nData de Nascimento: " + dataNasc);
        /*String texto = "Nome: " + nome + "\nCPF: " + cpf 
                + "\nData de Nascimento: " + dataNasc;
        System.out.println(texto);*/
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String getInfo() {
        return "Nome: " + nome + "\nCPF: " + cpf 
                + "\nData de Nascimento: " + dataNasc + "\n\n";
    }
    
}
