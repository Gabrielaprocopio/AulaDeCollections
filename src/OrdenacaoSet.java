import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got","fantasia","60"));
            add(new Serie("Dark", "drama", "60"));
            add(new Serie("That '70s show", "Comedia", "25"));
        }};
for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got","fantasia","60"));
            add(new Serie("Dark", "drama", "60"));
            add(new Serie("That '70s show", "Comedia", "25"));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println(minhasSeries2);


        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println(minhasSeries2);
    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;


    public Serie(String nome, String genero, String tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = Integer.valueOf(tempoEpisodio);
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio='" + tempoEpisodio + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie serie)) return false;
        return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }



    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}