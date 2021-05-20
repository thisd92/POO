package view;

import java.util.Scanner;
import model.Aluno;
import model.Pessoa;
import model.Professor;

/**
 *
 * @author Thiago
 */
public class TelaInicial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Voce e aluno ou professor? ");
        String valor;
        valor = s.next();
        if("Aluno".equals(valor)){
            Aluno a = new Aluno();
            System.out.print("Digite seu nome: ");
            a.setNome(s.next());
            System.out.print("Digite seu endereco: ");
            a.setEndereco(s.next());
            System.out.print("Digite seu CPF: ");
            a.setCpf(s.next());
            System.out.print("Digite seu telefone: ");
            a.setFone(s.next());
            System.out.print("Digite seu curso: ");
            a.setCurso(s.next());
            System.out.print("Digite a nota 1: ");
            a.setNota1(s.nextDouble());
            System.out.print("Digite a nota 2: ");
            a.setNota2(s.nextDouble());
            System.out.print("Digite a nota 3: ");
            a.setNota3(s.nextDouble());
            System.out.println("Sua media foi: " + a.calcularMedia());
            a.verificarAprovado();
        }else if ("Professor".equals(valor) ){
            Professor p = new Professor();
            System.out.print("Digite seu nome:");
            p.setNome(s.next());
            System.out.print("Digite seu endereco:");
            p.setEndereco(s.next());
            System.out.print("Digite seu CPF:");
            p.setCpf(s.next());
            System.out.print("Digite seu telefone:");
            p.setFone(s.next());
            System.out.print("Digite seu curso:");
            p.setCurso(s.next());
            System.out.print("Digite seu salario:");
            p.setSalario(s.nextDouble());
            p.calcularSalarioLiquido();
        }
        
    }
    
}
