package Set.operacoesBasicasComSet;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigo;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override //Serve para tirar os codigos duplicados
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigo == convidado.codigo && Objects.equals(nome, convidado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}
