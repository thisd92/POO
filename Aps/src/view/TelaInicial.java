package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Alcool;
import model.Diesel;
import model.Gasolina;
import model.Veiculo;

/**
 *
 * @author Thiago
 */
public class TelaInicial {

     public static void main(String[] args) {
        
        String opcao = "s";
        String tipoCombustivel = "t";
        List<Veiculo> listaVeiculo = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("0")){
            String texto = "Digite sua opcão: \n"+
                    "1 - Adicionar Veiculo \n" +
                    "2 - Remover Veiculo \n" +
                    "3 - Listar Veiculos \n" +
                    "0 - Sair";
            opcao = JOptionPane.showInputDialog(texto);
                   
            switch(opcao){
                case "1":
                            String textC = "O veiculo utiliza qual combustivel? \n"+
                                    "1 - Gasolina \n" +
                                    "2 - Etanol \n" +
                                    "3 - Diesel \n" +
                                    "0 - Sair";

                            tipoCombustivel = JOptionPane.showInputDialog(textC);                    
                            switch(tipoCombustivel){
                            case "1":
                                Gasolina g1 = new Gasolina();
                                
                                String marcaGasolina = JOptionPane.showInputDialog("Marca do veiculo ");
                                g1.setMarca(marcaGasolina);
                                
                                String nomeGasolina = JOptionPane.showInputDialog("Nome do Veiculo " + marcaGasolina);
                                g1.setNome(nomeGasolina);
                                
                                String tanqueGasolina = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaGasolina + " " + nomeGasolina);
                                g1.setCapacidadeTanque(Integer.valueOf(tanqueGasolina));
                                
                                String text1 = "Gasolina";
                                g1.setCombustivel(text1);
                                
                                g1.calculoCombustivel(); 
                                
                                listaVeiculo.add(g1);
                                break;
                            case "2":
                                Alcool a1 = new Alcool();
                                
                                String marcaAlcool = JOptionPane.showInputDialog("Marca do veiculo ");
                                a1.setMarca(marcaAlcool);
                                
                                String nomeAlcool = JOptionPane.showInputDialog("Nome do Veiculo " + marcaAlcool);
                                a1.setNome(nomeAlcool);

                                String tanqueAlcool = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaAlcool + " " + nomeAlcool);
                                a1.setCapacidadeTanque(Integer.valueOf(tanqueAlcool)); 
                                
                                String text2 = "Alcool";
                                a1.setCombustivel(text2);
                                
                                a1.calculoCombustivel();

                                listaVeiculo.add(a1);
                                break;
                            case "3":
                                Diesel d1 = new Diesel();
                                
                                String marcaDiesel = JOptionPane.showInputDialog("Marca do veiculo ");
                                d1.setMarca(marcaDiesel);
                                
                                String nomeDiesel = JOptionPane.showInputDialog("Nome do Veiculo " + marcaDiesel);
                                d1.setNome(nomeDiesel);
                                
                                String tanqueDiesel = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaDiesel + " " + nomeDiesel);
                                d1.setCapacidadeTanque(Integer.valueOf(tanqueDiesel));
                                
                                String text3 = "Diesel";
                                d1.setCombustivel(text3);
                                
                                d1.calculoCombustivel();

                                listaVeiculo.add(d1);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcao Invalida");
                            break;
                        }
                        break;
                case "2":
                    int posicao = Integer.valueOf(JOptionPane.showInputDialog("Informe a posicao que deseja remover"));
                    listaVeiculo.remove(posicao -1);
                    break;
                case "3":
                    String text = "";
                    for(Veiculo veiculo : listaVeiculo){
                        text += veiculo.getLista() + "\n";
                        text += "\n";
                    }
                    JOptionPane.showMessageDialog(null, text);
                    break;
                case "0":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");
                    break;
            } 
        }
    } 
}
    
