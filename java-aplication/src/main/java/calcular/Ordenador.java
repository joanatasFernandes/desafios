package main.java.calcular;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenador {
    public static <T>List<List<T>>ordenarLista(List<List<T>> value){
        Collections.sort(value, (o1, o2) -> o2.size() - o1.size());
        return value;
    }
}
