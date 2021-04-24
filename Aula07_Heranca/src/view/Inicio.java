package view;

import model.Fisica;
import model.Pessoa;

/**
 *
 * @author Thiago
 */
public class Inicio {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(0, null, null, null);
        p1.nome = "João";
        
        Fisica pf = new Fisica(1, "João", "Rua A", "123", "000");
        pf.cadastrar();
                
        //Pessoa p2 = new Fisica();
                
    }
    
}
