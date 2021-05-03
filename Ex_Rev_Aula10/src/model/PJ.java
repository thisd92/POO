package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class PJ extends Cliente{
    
    public String cnpj;

    @Override
    public void cadastrar() {
        System.out.println("Empresa " + nome + "cadastrda com sucesso");
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCNPJ: " + cnpj);
        /*String texto = "Nome: " + nome + "\nCNPJ: " + cnpj;
        System.out.println(texto);*/
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getInfo() {
        return "Nome: " + nome + "\nCPF: " + cnpj + "\n\n";
    }
    
}
