package listalinear;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    ArrayList<String> lista = new ArrayList();
    Scanner s = new Scanner(System.in);
    
    
    //metodos
    public void CriarLista(){
        lista.add("Arroz");
        lista.add("Feijao");
        lista.add("Carne");
        lista.add("Leite");
        lista.add("Ovos");
    }
    public void MostrarLista(){
        System.out.println("### EXIBINDO A LISTA ###");
        int t = lista.size();
        if (t == 0){
            System.out.println("A lista está vazia");
        }else{
            System.out.println("A lista possui " + t + " posições");
            //System.out.println("Lista: " + lista);
        }
        int i = 1;
        for(String l : lista){
            System.out.println(i + " - " + l);
            i++;
        }
    }
    
    public void Insere(){
        System.out.println("\n### INSERINDO ELEMENTO ###");
        System.out.println("Digite o elemento: ");
        String x = s.nextLine();
        System.out.println("Digite a posição: ");
        int p = s.nextInt()-1;
        lista.add(p,x);
    }
    
    public void Exclui(){
        System.out.println("\n### EXCLUINDO ELEMENTO ###");
        System.out.println("Digite a posição a ser excluída: ");
        int p = s.nextInt()-1;
        int t = lista.size();
        if (p > t){
            System.out.println("Número inválido");
        }else
        lista.remove(p);
    }
}