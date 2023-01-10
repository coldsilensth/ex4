package task4;

public class Cat extends Pet{
    private String name;

    public Cat(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
