package task5;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("Andrey"));
        treeSet.add(new Student("Masha"));
        treeSet.add(new Student("Sasha"));
        treeSet.add(new Student("Gena"));
        for(Student student: treeSet) {
            System.out.println(student);
        }
    }
}
