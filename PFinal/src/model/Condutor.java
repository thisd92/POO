package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Condutor {
    public String nome, fone, cnh, categoria;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public void excluirCondutor(){
        JOptionPane.showMessageDialog(null, "Condutor Excluido!");
    }
    
    
    public String getCondutor(){
        return "Condutor: " + nome + "\nCPF: " + cpf
                + "\nTelefone: " + fone + "\nCNH: " + cnh + "\nCategoria: " + categoria;
    }
}
