import java.util.*;


public class ExemploList  {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.7);
        notas.add(9.3);
        notas.add(6d);
        notas.add(5.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 9.3  : " + notas.indexOf(9.3));

        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
            notas.add(4,8.0);
            System.out.println(notas);

        System.out.println("Troque a nota 8.7 pela nota 7.8");
            notas.set(notas.indexOf(8.7),7.8);
        System.out.println(notas);

        System.out.println("Confira se a nota 3.6 está na lista: " + notas.contains(5.1));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
            System.out.println("Exima a soma dos valores: " + soma);

            System.out.println(" Exiba a media das notas: " + (soma/notas.size()));

            System.out.println("Remova a nota 7: ");
            notas.remove(7.0);
            System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia:  " + notas.isEmpty());
    }
}
