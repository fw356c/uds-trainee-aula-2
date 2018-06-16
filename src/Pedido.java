import java.util.ArrayList;
public class Pedido {
    private Double total=null;

    public ArrayList<Produto> produtos = new ArrayList();


    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public static void calcularTotal(){

    }


}
