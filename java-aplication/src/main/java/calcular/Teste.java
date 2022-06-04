package main.java.calcular;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Teste {
    public static List<String> encontraNomes(List<String> fonte, String nome, String nomeAhIgnorar) {
        return  fonte.stream()
                .filter(v -> v.contains(nome) && !v.contains(nomeAhIgnorar))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> fonte = Arrays.asList("Rodrigo Martins Silva", "Matheus Martins Andrade", "Roberto Ferreira Martins");
        List<String> strings = encontraNomes(fonte, "Martins", "Silva");
        System.out.println(strings);
    }

}

