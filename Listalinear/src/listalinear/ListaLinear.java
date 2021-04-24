package listalinear;

public class ListaLinear {
   
    public static void main(String[] args) {
        Lista linear = new Lista();
        linear.CriarLista();
        
        linear.MostrarLista();
        
        linear.Insere();
        
        linear.MostrarLista();
        
        linear.Exclui();
        
        linear.MostrarLista();
    }
}