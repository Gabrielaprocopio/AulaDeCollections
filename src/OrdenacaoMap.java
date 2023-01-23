import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephan", new Livro("Uma breve História do Tempo", 256));
            put("Duhigg Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()){

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

            Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
                put("Hawking, Stephan", new Livro("Uma breve História do Tempo", 256));
                put("Duhigg Charles", new Livro("O poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 lições para o Século 21", 432));
            }};
            for (Iterator<Map.Entry<String, Livro>> iterator = meusLivros1.entrySet().iterator(); iterator.hasNext(); ) {
                livro = iterator.next();
                System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
            }
        }
    }



}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return getNome().equals(livro.getNome()) && getPaginas().equals(livro.getPaginas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPaginas());
    }
}