package org.example.pracitce_generics;

public class GenericInterfaceExample {
    public static void main(String[] args) {
        Repository<String> stringRepo = new StringRepository();
        stringRepo.save("Hello, Generics!");
        System.out.println(stringRepo.get(0));

        Repository<Integer> intRepo = new IntegerRepository();
        intRepo.save(12345);
        System.out.println(intRepo.get(0));
    }
}
