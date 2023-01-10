package task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();

        hashMap.put("Кот", new Cat("Китуся"));
        hashMap.put("Собака", new Dog("Туфи"));
        hashMap.put("Попугай", new Parrot("Кеша"));
        System.out.println(hashMap);

        Pet cat = hashMap.get("Кот");
        System.out.println(cat);
        Pet dog = hashMap.get("Собака");
        System.out.println(dog);

        System.out.println(hashMap.containsKey("Собака"));
        System.out.println(hashMap.containsValue(dog));
    }
}
