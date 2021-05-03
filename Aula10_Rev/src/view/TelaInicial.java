package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Perecivel;

public class TelaInicial {
    
    public static void main(String[] args) {
       
        String opcao = "s";
        List<Perecivel> listaPerecivel = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("n")){
            String texto = "Digite sua opcão: \n"+
                    "1 - Adicionar Perecivel \n" +
                    "2 - Remover Perecivel \n" +
                    "3 - Listar Pereciveis \n" +
                    "n - Sair";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch(opcao){
                case "1":
                    Perecivel p = new Perecivel();
                    String nome = JOptionPane.showInputDialog("Nome do Perecivel");
                    p.setNome(nome);
                    
                    String preco = JOptionPane.showInputDialog("Preco do Perecivel " + nome);
                    preco = preco.replace(",",".");
                    p.setPreco(Double.valueOf(preco));
                    
                    String qtde = JOptionPane.showInputDialog("Quantidade do Perecivel "+ nome);
                    qtde = qtde.replace(",",".");
                    p.setQuantidade(Double.valueOf(qtde));
                    
                    listaPerecivel.add(p);
                    break;
                case "2":
                    int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posicao que deseja remover"));
                    listaPerecivel.remove(posicao -1);
                    break;
                case "3":
                    String text = "";
                    for(Perecivel perecivel : listaPerecivel){
                        text += perecivel.getInformacao() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, text);
                    break;
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                    break;
            } 
        }
    } 
}
