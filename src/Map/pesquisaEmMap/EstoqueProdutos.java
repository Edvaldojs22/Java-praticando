package Map.pesquisaEmMap;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoque.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoque);
    }

    public double calcularProdutos() {
        double valorTotalEstoque = 0;

        if (!estoque.isEmpty()) {

            for (Produto p : estoque.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("Lista de produtos vazia!");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto prodotoMaisCaro= null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoque.values()) {
            if(p.getPreco() > maiorPreco){
               prodotoMaisCaro = p;
               maiorPreco = p.getPreco();
            }
        }

        return prodotoMaisCaro;

    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Moto", 2, 8000);
        estoqueProdutos.adicionarProduto(2L, "Carro", 1, 30000);
        estoqueProdutos.adicionarProduto(3L, "Casaco", 1, 200);
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }
}
