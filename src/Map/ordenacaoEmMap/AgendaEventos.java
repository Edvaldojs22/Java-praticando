package Map.ordenacaoEmMap;

import Map.operacoesBasicasComMap.AgendaContatos;

;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        Evento evento = new Evento(nomeEvento, nomeAtracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 15), "Evento 1","Atracao 1");
        agenda.adicionarEvento(LocalDate.of(2023, Month.JUNE, 12), "Evento 2","Atracao 2");
        agenda.adicionarEvento(LocalDate.of(2050, Month.JUNE, 24), "Evento 3","Atracao 3");
        agenda.adicionarEvento(LocalDate.of(2030, Month.JUNE, 10), "Evento 4","Atracao 4");
        agenda.obterProximoEvento();


    }




}
