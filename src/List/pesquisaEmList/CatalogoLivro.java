package List.pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> listaLivros;

    public CatalogoLivro() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        listaLivros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaLivroAutor = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaLivroAutor.add(l);
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }
        return listaLivroAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaPorIntervalodAno = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaPorIntervalodAno.add(l);
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }
        return listaPorIntervalodAno;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> listaPorTitutolo = new ArrayList<>();

        if (!listaLivros.isEmpty()) {
            for (Livro t : listaLivros) {
                if (t.getTitulo().equalsIgnoreCase(titulo)) {
                    listaPorTitutolo.add(t);
                    break;
                }
            }

        } else {
            System.out.println("Lista vazia!");
        }


        return listaPorTitutolo;
    }

    public void exibirLista() {
        System.out.println(listaLivros);
    }


    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Hora da bagunça", "chico", 2000);
        catalogoLivro.adicionarLivro("bagunca", "chico", 2004);
        catalogoLivro.adicionarLivro("trovao", "zeus", 2007);
        catalogoLivro.adicionarLivro("raio", "chico", 2020);
        catalogoLivro.adicionarLivro("trovao", "zeus2", 20023);


        System.out.println(catalogoLivro.pesquisarPorTitulo("bagunca"));
    }
}

