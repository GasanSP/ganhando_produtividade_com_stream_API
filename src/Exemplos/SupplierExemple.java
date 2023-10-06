package Exemplos;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo
 */

public class SupplierExemple {

    public static void main(String[] args) {
        //usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //usar o Supplier para obter uma lista de 5 saudações
        List<String> listaSaudacoes = Stream.generate(() ->  "Olá, seja bem vindo(a)!")
                .limit(5)
                .toList();

        //imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
