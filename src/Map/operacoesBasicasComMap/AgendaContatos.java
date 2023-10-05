package Map.operacoesBasicasComMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContato;

    public AgendaContatos() {
        this.agendaContato = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        this.agendaContato.put(nome, telefone);
    }

    public void removeContato(String nome) {
        if (!agendaContato.isEmpty()) {
            agendaContato.remove(nome);
        } else {
            System.out.println("Agenda vazía!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContato);
    }

    public Integer pesquisaPorNome(String nome) {
        int numeroTelefone = 0;
        if (!agendaContato.isEmpty()) {
            numeroTelefone = agendaContato.get(nome);
        } else {
            System.out.println("Agenda vazía!");
        }
        return numeroTelefone;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionaContato("Mario", 839111111);
        agendaContatos.adicionaContato("Brucee", 839222222);
        agendaContatos.adicionaContato("Caio", 83933333);
        agendaContatos.adicionaContato("Brucee", 839444444);
        agendaContatos.exibirContatos();



    }
}
