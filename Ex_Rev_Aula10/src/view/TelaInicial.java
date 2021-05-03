/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.PF;
import model.PJ;

/**
 *
 * @author Thiago
 */
public class TelaInicial {
    
    public static void main(String[] args) {
        
        String opcao = "s";
        String lista = "n";
        String remover = "y";
        List<PJ> listaPJ = new ArrayList<>();
        List<PF> listaPF = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("0")){
            String texto = "Cadastro: \n"+
                    "1 - Pessoa Fisica \n" +
                    "2 - Pessoa Juridica \n" +
                    "3 - Listar \n" +
                    "4 - Remover \n" +
                    "0 - Sair";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch(opcao){
                case "1":
                    PF pf = new PF();
                    String nome = JOptionPane.showInputDialog("Nome da Pessoa Fisica");
                    pf.setNome(nome);
                    
                    String cpf = JOptionPane.showInputDialog("CPF: ");
                    pf.setCpf(cpf);
                    
                    String dataNasc = JOptionPane.showInputDialog("Data de Nascimento: ");
                    pf.setDataNasc(dataNasc);
                    
                    pf.imprimir();
                    
                    listaPF.add(pf);
                    break;
                case "2":
                    PJ pj = new PJ();
                    String nome1 = JOptionPane.showInputDialog("Nome da Pessoa Juridica");
                    pj.setNome(nome1);
                    
                    String cnpj = JOptionPane.showInputDialog("CNPJ: ");
                    pj.setCnpj(cnpj);
                    
                    pj.imprimir();
                    
                    listaPJ.add(pj);
                    break;
                case "3":
                    String textC = "Lista de: \n"+
                                    "1 - PF \n" +
                                    "2 - PJ \n" +
                                    "0 - Sair";

                            lista = JOptionPane.showInputDialog(textC);                    
                            switch(lista){
                                case "1":
                                    String text1 = "";
                                    for(PF pf1 : listaPF){
                                    text1 += pf1.getInfo();
                                    }
                                    JOptionPane.showMessageDialog(null, text1);
                                    break;
                                case "2":
                                    String text2 = "";
                                    for(PJ pj1 : listaPJ){
                                    text2 += pj1.getInfo();
                                    }
                                    JOptionPane.showMessageDialog(null, text2);
                                    break;
                                case "0":
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                                    break;
                            }
                    break;
                case "4":
                    String textD = "Excluir: \n"+
                                    "1 - PF \n" +
                                    "2 - PJ \n" +
                                    "0 - Sair";

                            remover = JOptionPane.showInputDialog(textD);                    
                            switch(remover){
                                case "1":
                                    int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posicao da PF que deseja remover"));
                                    listaPF.remove(posicao -1);
                                    break;
                                case "2":
                                    int posicao1 = Integer.valueOf(JOptionPane.showInputDialog("Informe a posicao da PJ que deseja remover"));
                                    listaPJ.remove(posicao1 -1);
                                    break;
                                case "0":
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                                    break;    
                            }
                    break;
                case "0":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                    break;
            } 
        }        
        
        
        /*PF pf = new PF();
        PJ pj = new PJ();
        Scanner sc = new Scanner(System.in);
        
        List<PF> listaPF = new ArrayList <>();
        List<PJ> listaPJ = new ArrayList <>();

        
        
        
        pj.setNome("BAFAFA LANCHES E DOCES");
        pj.setCnpj("26.449.555/0001-55");
        listaPJ.add(pj);
        
        //pj.imprimir();
        
        pj.setNome("BLACK FAFA'S");
        pj.setCnpj("52.515.111/0001-15");
        listaPJ.add(pj);
        
        pj.getInfo();
        
        String teste = "y";
        while(!teste.equalsIgnoreCase("Sair")){
                    
            System.out.println("Digite um nome: ");
            String nome = sc.next();
            pf.setNome(nome);
            System.out.println("Digite o CPF: ");
            String cpf = sc.next();
            pf.setCpf(cpf);
            
            listaPF.add(pf);

            }
        if(teste == "Sair"){
            String text = "";
            for(PF pf1 : listaPF){
                text += pf1.getInfo();            
            }
        }*/    
    }
    
}
