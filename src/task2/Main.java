package task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел:");
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            Integer num = scanner.nextInt();
            numbers.add(num);

        }
        System.out.println(numbers);

    }
}