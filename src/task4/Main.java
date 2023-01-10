package task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();

        hashMap.put("Cat", new Cat("Китуся"));
        hashMap.put("Dog", new Dog("Туфи"));
        hashMap.put("Parrot", new Parrot("Кеша"));
        System.out.println(hashMap);

        Pet cat = hashMap.get("Cat");
        System.out.println(cat);
        Pet dog = hashMap.get("Dog");
        System.out.println(dog);

        System.out.println(hashMap.containsKey("Dog"));
    }
}
