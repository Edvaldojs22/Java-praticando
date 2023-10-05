package Set.ordenacaoEmSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        this.produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPornome (){
        Set<Produto> produtosPornome = new TreeSet<>(produtosSet);
        return produtosPornome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Smartphone",23323, 1000, 2);
        cadastroProdutos.adicionarProduto("TV",22222, 2000, 2);
        cadastroProdutos.adicionarProduto("Carro",6666, 2000, 3);
        cadastroProdutos.adicionarProduto("Smartphone",54523, 6990, 1);

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

}


