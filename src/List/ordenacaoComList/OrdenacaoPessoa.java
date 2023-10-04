package List.ordenacaoComList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoa() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionaPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {

        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {

        List<Pessoa> lisPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(lisPorAltura, new ComparePorAltura());
        return lisPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionaPessoa("nome 1", 1, 1.70);
        ordenacaoPessoa.adicionaPessoa("nome 2", 2, 1.50);
        ordenacaoPessoa.adicionaPessoa("nome 3", 3, 1.60);


        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }


}
