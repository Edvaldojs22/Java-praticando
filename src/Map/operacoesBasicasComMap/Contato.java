package Map.operacoesBasicasComMap;

public class Contato {

    private String nome;
    private Integer  telefone;

    public Contato(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome= " + nome + '\'' +
                ", telefone= " + telefone +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getTelefone() {
        return telefone;
    }
}
