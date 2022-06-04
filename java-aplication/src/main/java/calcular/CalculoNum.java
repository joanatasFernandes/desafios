package main.java.calcular;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CalculoNum {
    public int dividir(int valor) {
        return valor / 2;
    }

    public int mutiplica(int valor) {
        return 3 * valor + 1;
    }

    public List<List<Integer>> calcular(String... values) {
        List<List<Integer>> outputResult = new ArrayList<>();
        try {
            for (String value : values) {
                List<Integer> result = calcular(new ArrayList<>(), Integer.parseInt(value) );
                outputResult.add(result);
            }
        }catch (Exception exception){
            System.out.println("Não foi possivel efetuar o calculo com os valores informados.");
            System.out.println("Tente novamente informando apenas numeros inteiros.");
            throw exception;
        }
        return outputResult;
    }

    private List<Integer> calcular(List<Integer> output, int value) {
        output.add(value);
        if (value == 1) {
            return output;
        }
        if (value % 2 == 0) {
            return calcular(output, dividir(value));
        }
        return calcular(output, mutiplica(value));
    }

}
