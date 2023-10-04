package Set.operacoesBasicasComSet;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> listConvidado;

    public ConjuntoConvidados() {

        this.listConvidado = new HashSet<>();
    }

    public void adicionaConvidado(String nome, int codigo) {
        this.listConvidado.add(new Convidado(nome, codigo));
    }

    public void removeConvidadoPorCodigo(int codigo) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : listConvidado) {
            if (c.getCodigo() == codigo) {
                convidadoParaRemover = c;
                break;
            }
        }
        listConvidado.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return listConvidado.size();
    }

    public void exibiConvidados(){
        System.out.println(listConvidado);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        conjuntoConvidados.adicionaConvidado("Rebeca", 2323);
        conjuntoConvidados.adicionaConvidado("Edvaldo", 123);
        conjuntoConvidados.adicionaConvidado("Edvaldo", 123);

        conjuntoConvidados.exibiConvidados();



    }

}
