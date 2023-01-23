import java.lang.reflect.Array;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.0,6.7,4.5,8.7,0.0));
        System.out.println(notas);

        System.out.println("Confira se a nota 8.5 está no conjunto: " + notas.contains(8.5));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Imprima a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
           Double next = iterator.next();
            soma += next;
        }
        System.out.println("Imprima a soma dos valores: " + soma);

        System.out.println("Media dos valores: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
       Iterator<Double> iterator1 = notas.iterator();
       while (iterator1.hasNext()){
           Double next = iterator1.next();
           if (next < 7) iterator1.remove();
       }

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.0);
        notas2.add(6.7);
        notas2.add(4.5);
        notas2.add(8.7);
        notas2.add(0.0);

        System.out.println("Imprima as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda as notas: ");
        notas.clear();

        System.out.println("Confira de se está vazio: " + notas.isEmpty());



    }
}
