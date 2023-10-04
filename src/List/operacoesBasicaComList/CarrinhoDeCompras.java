package List.operacoesBasicaComList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItem;


    public CarrinhoDeCompras (){
        this.listaDeItem = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + listaDeItem +
                '}';
    }


    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItem.add(new Item(nome, preco,quantidade));
    }


    public void removerItem(String nome){
        List<Item> listaParaRemover = new ArrayList<>();
        if(!listaDeItem.isEmpty()){
            for(Item i: listaDeItem){
                if(i.getNome().equalsIgnoreCase(nome)){
                    listaParaRemover.add(i);
                }
            }
            listaDeItem.removeAll(listaParaRemover);
        }else {
            System.out.println("Lista vazia!");
        }

    }

    public double calcularValotTotal(){
        double valorFinal = 0;
        for (Item i: listaDeItem){
            double valorItem = i.getPreco() * i.getQuantidade();
            valorFinal += valorItem;
        }

        return valorFinal;

    }

    public void exibirItem(){
        System.out.println(listaDeItem);
    }




    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("caneta", 1, 5);
        carrinhoDeCompras.adicionarItem("livro" , 10, 2);
        carrinhoDeCompras.removerItem("caneta");


       carrinhoDeCompras.exibirItem();
    }

}
