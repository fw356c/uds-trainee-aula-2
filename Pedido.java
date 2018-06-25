import java.util.ArrayList;
public class Pedido {
    private Double total=0.0;

    public ArrayList<Produto> produtos = new ArrayList();


    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void calcularTotal() {
        produtos.stream().forEach((produto) -> {
            total+=produto.valorProduto;
        });
        System.out.printf("Total do pedido = %.2f",  (total ));
    }
}








