package Set.pesquisaEmSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contado> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatoSet.add(new Contado(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contado> pesquisaPorNome(String nome) {
        Set<Contado> contadosPorNome = new HashSet<>();
        for (Contado c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contadosPorNome.add(c);
            }
        }

        return contadosPorNome;
    }


    public Contado atualizaContato(String nome, int novoNumero) {
        Contado contatoAtualizado = null;

        if (!contatoSet.isEmpty()) {

            if(contatoSet.contains(nome)){

                for (Contado c : contatoSet) {
                    if (c.getNome().equalsIgnoreCase(nome)) {
                        c.setNumero(novoNumero);
                        contatoAtualizado = c;
                        break;
                    }
                }

            }else {
                System.out.println("Lista de contatos não pussui este nome");
            }


        } else {
            System.out.println("Lista de contatos vazia");
        }

        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();


        agendaContato.adicionarContatos("Edvaldo", 835532902);
        agendaContato.adicionarContatos("rebeca", 28324923);
        agendaContato.adicionarContatos("Edvaldo", 33491238);
        agendaContato.exibirContatos();

        agendaContato.atualizaContato("Edvaldo", 831111111);
        agendaContato.exibirContatos();
    }
}
