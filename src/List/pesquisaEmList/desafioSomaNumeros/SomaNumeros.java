package List.pesquisaEmList.desafioSomaNumeros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;


    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero) {
        this.listaNumeros.add(numero);
    }

    public List<Integer> numeroPares() {
        List<Integer> listaPar = new ArrayList<>();

        for(Integer n : listaNumeros){
            if(n % 2 == 0){
                listaPar.add(n);
            }
        }

        return  listaPar;
    }


    public int calculaSoma() {
        int soma = 0;

        for (Integer n : listaNumeros) {
            soma += n;
        }

        return soma;
    }

    public void exibirLista() {
        System.out.println(listaNumeros);
    }


    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionaNumero(2);
        somaNumeros.adicionaNumero(20);
        somaNumeros.adicionaNumero(30);
        somaNumeros.adicionaNumero(120);
        somaNumeros.adicionaNumero(3453);


        System.out.println(somaNumeros.numeroPares());

//        somaNumeros.exibirLista();
    }

}
