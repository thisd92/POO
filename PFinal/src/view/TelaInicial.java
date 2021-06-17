package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Alcool;
import model.Condutor;
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
        List<Condutor> listaCondutores = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("0")){
            String texto = "Bem-Vindo! \n\n"+
                    "Veiculos: \n" + 
                    "1 - Adicionar Veiculo \n" +
                    "2 - Remover Veiculo \n" +
                    "3 - Listar Veiculos \n\n" +
                    "Condutores: \n" +
                    "4 - Cadastrar Condutor \n" +
                    "5 - Remover Condutor \n" +
                    "6 - Listar Condutores \n\n" +
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
                                
                                String nomeGasolina = JOptionPane.showInputDialog("Modelo do Veiculo " + marcaGasolina);
                                g1.setNome(nomeGasolina);
                                
                                String anoGasolina = JOptionPane.showInputDialog("Ano do Veiculo " + marcaGasolina + " " + nomeGasolina);
                                g1.setAno(anoGasolina);
                                
                                String tanqueGasolina = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaGasolina + " " + nomeGasolina);
                                g1.setCapacidadeTanque(Integer.valueOf(tanqueGasolina));
                                
                                String text1 = "Gasolina";
                                g1.setCombustivel(text1);

                                listaVeiculo.add(g1);
                                break;
                            case "2":
                                Alcool a1 = new Alcool();
                                
                                String marcaAlcool = JOptionPane.showInputDialog("Marca do veiculo ");
                                a1.setMarca(marcaAlcool);
                                
                                String nomeAlcool = JOptionPane.showInputDialog("Modelo do Veiculo " + marcaAlcool);
                                a1.setNome(nomeAlcool);
                                
                                String anoAlcool = JOptionPane.showInputDialog("Ano do Veiculo " + marcaAlcool + " " + nomeAlcool);
                                a1.setAno(anoAlcool);

                                String tanqueAlcool = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaAlcool + " " + nomeAlcool);
                                a1.setCapacidadeTanque(Integer.valueOf(tanqueAlcool)); 
                                
                                String text2 = "Alcool";
                                a1.setCombustivel(text2);

                                listaVeiculo.add(a1);
                                break;
                            case "3":
                                Diesel d1 = new Diesel();
                                
                                String marcaDiesel = JOptionPane.showInputDialog("Marca do veiculo ");
                                d1.setMarca(marcaDiesel);
                                
                                String nomeDiesel = JOptionPane.showInputDialog("Modelo do Veiculo " + marcaDiesel);
                                d1.setNome(nomeDiesel);
                                
                                String anoDiesel = JOptionPane.showInputDialog("Ano do Veiculo " + marcaDiesel + " " + nomeDiesel);
                                d1.setAno(anoDiesel);
                                
                                String tanqueDiesel = JOptionPane.showInputDialog("Capacidade do tanque de combustivel do veiculo " + marcaDiesel + " " + nomeDiesel);
                                d1.setCapacidadeTanque(Integer.valueOf(tanqueDiesel));
                                
                                String text3 = "Diesel";
                                d1.setCombustivel(text3);

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
                case "4":
                    Condutor condutor = new Condutor();
                   
                    String nomeCondutor = JOptionPane.showInputDialog("Nome do condutor: ");
                    condutor.setNome(nomeCondutor);

                    String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                    condutor.setCpf(cpf);

                    String fone = JOptionPane.showInputDialog("Digite o telefone: ");
                    condutor.setFone(fone);
                    
                    String cnh = JOptionPane.showInputDialog("Digite a CNH: ");
                    condutor.setCnh(cnh);
                    
                    String categoria = JOptionPane.showInputDialog("Digite a Categoria da CNH: ");
                    condutor.setCategoria(categoria);
                    
                    listaCondutores.add(condutor);
                    break;
                case "5":
                    int posicao1 = Integer.valueOf(JOptionPane.showInputDialog("Informe a posicao que deseja remover: "));
                    listaCondutores.remove(posicao1 -1);
                    break;
                case "6":
                    String text4 = "";
                    for(Condutor condutor1 : listaCondutores){
                        text4 += condutor1.getCondutor() + "\n";
                        text4 += "\n";
                    }
                    JOptionPane.showMessageDialog(null, text4);
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
    
