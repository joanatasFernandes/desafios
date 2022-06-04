package main.java.calcular;

import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) {
        CalculoNum calculoNum = new CalculoNum();
        List<List<Integer>> resultadoDoCalculo = calculoNum.calcular(args);

        if (!resultadoDoCalculo.isEmpty()) {

            resultadoDoCalculo.forEach(CalculatorMain::imprimirLista);
            if (resultadoDoCalculo.size() > 1) {
                List<List<Integer>> listaOrdenada = Ordenador.ordenarLista(resultadoDoCalculo);
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
