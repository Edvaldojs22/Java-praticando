package Set.pesquisaEmSet;

import java.util.Objects;

public class Contado {
    private String nome;
    private int numero;


    public Contado(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contado{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contado contado)) return false;
        return Objects.equals(getNome(), contado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
