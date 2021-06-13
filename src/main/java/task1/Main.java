package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение: ");
        List<String> orderList = generator(reader.readLine());
        for (String world : orderList)
            System.out.println(world);
    }

    public static List<String> generator(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        return list.stream().filter(x -> !x.equals(""))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
// в программе присутствуют следующие черты функционального стиля:
// чистая функция "generator" - результат работы функции зависит только от входных параметров (детерминированная функция), также используется монада.