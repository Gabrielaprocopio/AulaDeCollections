import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a temperatura média do mês");
        System.out.println("Mês de janeiro");
        Double resposta = scan.nextDouble();
        temperaturas.add(resposta);
        System.out.println("Mês de Fevereiro");
        resposta = scan.nextDouble();
        temperaturas.add(resposta);
        System.out.println("Mês de Março");
        resposta = scan.nextDouble();
        temperaturas.add(resposta);
        System.out.println("Mês de Abril");
        resposta = scan.nextDouble();
        temperaturas.add(resposta);
        System.out.println("Mês de Maio");

        System.out.println("Todas as temperaturas: " + temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Média das temperaturas: " + soma/temperaturas.size());

        Double media = soma/ temperaturas.size();


           }
       }


