package main.java.calcular;

import main.java.calcular.CalculoNum;

import java.util.List;

public class TesteMain {
    public static void main(String[] args) {
        CalculoNum calculoNum = new CalculoNum();
        List<List<Integer>> calcular = calculoNum.calcular(args);

        if (!calcular.isEmpty()) {

            calcular.forEach(TesteMain::imprimirLista);
            if (calcular.size() > 1) {
                List<List<Integer>> listaOrdenada = Ordenador.ordenarLista(calcular);
                Ordenador.ordenarLista(listaOrdenada);
                List<Integer> maiorLista = listaOrdenada.get(0);
                System.out.printf("Maior sequencia tem tamnho %d%n", maiorLista.size());
               imprimirLista(maiorLista);

            }
        }


    }

    private static void imprimirLista(List<Integer>values){
        String output = values.toString().replace("[", "").replace("]", "");
        System.out.println(output);
    }
}
