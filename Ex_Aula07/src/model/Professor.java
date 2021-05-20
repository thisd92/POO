package model;

/**
 *
 * @author Thiago
 */
public class Professor extends Pessoa{
    String curso;
    double salario;
    static double ir = 15;
    static int inss = 11;
    
    public double calcularSalarioLiquido(){
        return salario - (salario * (inss/100)) - (salario * (inss/100))*(ir/100);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double tirarCopia() {
        return copiaProf;
    }
    
}
