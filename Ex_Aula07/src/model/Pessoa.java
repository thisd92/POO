package model;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public abstract class Pessoa {
    
    String nome, endereco, fone, cpf;
    public static double copiaAluno = 0.10;
    public static double copiaProf = 0.05;
    
    public void Pessoa(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = s.next();
        System.out.println("Digite o endereco: ");
        endereco = s.next();
        System.out.println("Digite o telefone: ");
        fone = s.next();
        System.out.println("Digite o CPF: ");
        cpf = s.next();
    }
    public void pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract double tirarCopia();
}
