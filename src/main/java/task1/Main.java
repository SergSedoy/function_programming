package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение: ");
        List<String> orderList = generator(reader.readLine());
        for (String world : orderList)
            System.out.println(world + "-");
    }

    public static List<String> generator(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        return list.stream().filter(x -> x.length() > 0)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
