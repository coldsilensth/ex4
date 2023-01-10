package task2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел:");
        String inputLine = new Scanner(System.in).nextLine();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < inputLine.length(); i++) {
            String n = String.valueOf(inputLine.charAt(i));
            if (n.matches("[1-9]+")) hashSet.add(Integer.valueOf(n));
        }
        System.out.println(hashSet);
    }
}